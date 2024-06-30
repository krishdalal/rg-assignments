import java.util.ArrayList;
import java.util.List;

public class EmployeeCRUD{
    private List<Employee> employeeList;

    public EmployeeCRUD(){
        employeeList = new ArrayList<>();
    }

    // Create: Add new employee
    public void addEmployee(Employee employee){
        employeeList.add(employee);
        System.out.println("Added " + employee);
    }

    // Read : Get all employees
    public List<Employee> getAllEmployees(){
        return employeeList;
    }

    // Read : Get employee by id
    public String getEmployeeById(int id){
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                return employee.toString();
            }
        }
        return "Employee with id " + id + " not found";
    }

    // Update: Update existing employee
    public void updateEmployee(int id, String name, String department) {
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                employee.setName(name);
                employee.setDepartment(department);
                System.out.println("Updated : " + employee);
                return;
            }
        }
        System.out.println("Employee with id " + id + " not found");
    }

    // Delete: Remove employee by id
    public void deleteEmployee(int id) {
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                employeeList.remove(employee);
                System.out.println("Removed : " + employee);
                return;
            }
        }
        System.out.println("Employee with id " + id + " not found");
    }

    public static void main(String[] args) {
        EmployeeCRUD strawHatPirates = new EmployeeCRUD();

        // Create
        strawHatPirates.addEmployee(new Employee(1, "Tony Chopper", "Medical"));
        strawHatPirates.addEmployee(new Employee(2, "Sanji", "Culinary"));

        // Read
        System.out.println("All Employees: " + strawHatPirates.getAllEmployees());

        // Read by id
        System.out.println("Employee of id : 2 is " + strawHatPirates.getEmployeeById(2));

        // Update
        strawHatPirates.updateEmployee(1, "Nami", "Navigation");

        // Delete
        strawHatPirates.deleteEmployee(2);

        // Read again
        System.out.println("All Employees after updates: " + strawHatPirates.getAllEmployees());
    }

}