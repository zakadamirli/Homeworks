package MentorDay18.Exercise;

import java.util.Scanner;

public class UserRegistration {

    static Scanner sc = new Scanner(System.in);
    static String username;
    static String password;

    public static void registerUser() {
        System.out.println("Enter user name");
        username = sc.nextLine();
        System.out.println("Enter password");
        password = sc.nextLine();
    }


    public static boolean ShortOrLong(String username, String pass) throws UserRegistrationException {
        if (username.length() < 5 && pass.length() < 8) {
            throw new UserRegistrationException("Username is too short");
        } else {
            System.out.println("Registration successful");
            return true;
        }

    }
}
