package MentorDay18.AuthenticateManagementSystem;

public class AuthenticateManagement {
    public static boolean login(String s1, String s2) {
        return s1.equals(s2);
    }

    public static void checkLogin(String usernameExpected, String usernameActual, String passwordExpected, String passwordActual) throws AuthenticationException {
        if (login(usernameExpected, usernameActual) && login(passwordExpected, passwordActual)) {
            System.out.println("Login is successful");
        } else {
            throw new AuthenticationException("Login failed");
        }
    }
}
