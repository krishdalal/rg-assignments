import java.sql.*;

public class EmployeeJDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/employee_db";
    private static final String USER = "root";
    private static final String PASSWORD = "ENTER_YOUR_PASSWORD";

    private Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Create : Add new employee
    public void createEmployee(Employee employee) {
        String sql = "INSERT INTO Employee (name, department) VALUES (?, ?)";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, employee.getName());
            pstmt.setString(2, employee.getDepartment());
            pstmt.executeUpdate();
            try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    employee.setId(generatedKeys.getInt(1));
                    System.out.println("Added " + employee);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Read : Get employee by id
    public Employee readEmployee(int id) {
        String sql = "SELECT * FROM Employee WHERE id = ?";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new Employee(rs.getInt("id"), rs.getString("name"), rs.getString("department"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Update : Update existing employee
    public void updateEmployee(Employee employee) {
        String sql = "UPDATE Employee SET name = ?, department = ? WHERE id = ?";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, employee.getName());
            pstmt.setString(2, employee.getDepartment());
            pstmt.setInt(3, employee.getId());
            pstmt.executeUpdate();
            System.out.println("Updated : " + employee);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete : Remove employee by id
    public void deleteEmployee(int id) {
        String sql = "DELETE FROM Employee WHERE id = ?";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Removed employee with id : " + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        EmployeeJDBC strawHatPirates = new EmployeeJDBC();
        Employee employee0 = new Employee(1, "Tony Chopper", "Medical");
        Employee employee1 = new Employee(2, "Sanji", "Culinary");

        // Create
        strawHatPirates.createEmployee(employee0);
        strawHatPirates.createEmployee(employee1);

        // Read
        Employee fetchedEmployee = strawHatPirates.readEmployee(2);
        System.out.println("Employee with id 2 : " + fetchedEmployee);

        // Update
        fetchedEmployee.setName("Nami");
        fetchedEmployee.setDepartment("Navigation");
        strawHatPirates.updateEmployee(fetchedEmployee);

        // Delete
        strawHatPirates.deleteEmployee(1);

    }
}