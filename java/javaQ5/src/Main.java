//Note: This is not an actual credentials management system,
//this example is just to show how a class is encapsulated,
//and how encapsulation is useful

public class Main {

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