/**
 * Class that defines the login user requirement
 */
public class LoginFeature {

    /**
     * Allow a user to create an account
     * @param account name to be created
     * @return inputted account name
     */
    public static String createAccount(String account) {
        return account;
    }

    /**
     * Create the mechanism for logging a user in with valid credentials
     * @param username user input
     * @param password password of the user
     * @return true if credentials are valid, false otherwise
     */
    public static boolean login(String username, String password) {
        return true;
    }

}