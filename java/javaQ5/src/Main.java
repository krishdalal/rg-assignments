//Note: This is not an actual credentials management system,
//this example is just to show how a class is encapsulated,
//and how encapsulation is useful

public class Main {
    private static class Credentials{
        private String username;
        private String password;
        private final int accountNo;

        public Credentials(String username, String password){
            this.username = username;
            this.password = password;
            this.accountNo = Math.abs((username + " " + password).hashCode());
        }

        public String getUsername() {
            return username;
        }

        public int getAccountNo() {
            return accountNo;
        }

        public int getHashedPassword() {
            return password.hashCode();
        }

        public void resetUsername(String username) {
            this.username = username;
        }

        public void resetPassword(String password) {
            this.password = password;
        }
    }
    public static void main(String[] args) {

        Credentials cred = new Credentials("Luffy", "abcd1234");

        System.out.println("Username is : " + cred.getUsername());
        System.out.println("Hashed Password is " + cred.getHashedPassword());
        System.out.println("Account No is : " + cred.getAccountNo());

        cred.resetUsername("Zoro");
        cred.resetPassword("xyz9876");
        System.out.println(" ");

        System.out.println("New Username is : " + cred.getUsername());
        System.out.println("New Hashed Password is " + cred.getHashedPassword());
        System.out.println("Account No is : " + cred.getAccountNo());
    }
}