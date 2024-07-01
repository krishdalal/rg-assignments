// Note that this is not an actual implementation of Database Connection Manager,
// but only an example to show what singleton design pattern is and how is it useful

public class DatabaseConnectionManager {
    // Private static instance of the class
    private static DatabaseConnectionManager instance;

    private DatabaseConnectionManager() {
        // Private constructor to prevent instantiation from external entities
    }

    public static DatabaseConnectionManager getInstance() {
        // Static method to access the instance,
        // and to ensure that only one instance is created if it doesn't exist
        if (instance == null) {
            instance = new DatabaseConnectionManager();
        }
        return instance;
    }

    public void connect(){
        System.out.println("Connected using Singleton DatabaseConnectionManager...");
    }

}
