public class Credentials{
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
