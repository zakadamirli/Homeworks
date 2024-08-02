package MentorDay18.AuthenticateManagementSystem;

import java.util.Scanner;

public class LoginMain {
    static Scanner sc = new Scanner(System.in);
    final static String password = "Password123";
    final static String username = "admin123";


    public static void main(String[] args) {
        System.out.println("Enter password: ");
        String pass = sc.nextLine();
        System.out.println("Enter username");
        String user = sc.nextLine();

        try {
            AuthenticateManagement.checkLogin(password, pass, username, user);
        } catch (AuthenticationException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: another reason ");
        }

    }
}
