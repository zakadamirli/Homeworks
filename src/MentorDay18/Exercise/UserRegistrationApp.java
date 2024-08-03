package MentorDay18.Exercise;

import java.util.Scanner;

public class UserRegistrationApp {
    public static void main(String[] args) throws UserRegistrationException {

        Scanner s = new Scanner(System.in);
        UserRegistration.registerUser();
        try {
            UserRegistration.ShortOrLong(UserRegistration.username, UserRegistration.password);
        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }
}
