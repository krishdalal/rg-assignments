public class Main {
    public static void main(String[] args) {
        // Accessing the single instance of DatabaseConnectionManager
        DatabaseConnectionManager connectionManager1 = DatabaseConnectionManager.getInstance();
        connectionManager1.connect();

        // Try to make another instance
        DatabaseConnectionManager connectionManager2 = DatabaseConnectionManager.getInstance();
        // Check if both instances are same
        System.out.println("Are both connection managers the same ?");
        System.out.println(connectionManager1==connectionManager2);

    }
}
