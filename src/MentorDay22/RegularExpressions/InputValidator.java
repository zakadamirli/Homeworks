package MentorDay22.RegularExpressions;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputValidator {

    public static boolean validateEmail(String email) {
        String emailRegex = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        return Pattern.matches(emailRegex, email);
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        String phoneRegex = "^\\+?\\d{0,3}[- .]?\\(?\\d{3}\\)?[- .]?\\d{3}[- .]?\\d{4}$";
        return Pattern.matches(phoneRegex, phoneNumber);
    }

    public static boolean validatePassword(String password) {
        String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
        return Pattern.matches(passwordRegex, password);
    }

    public static boolean validateUsername(String username) {
        String usernameRegex = "^[a-zA-Z0-9_]{4,15}$";
        return Pattern.matches(usernameRegex, username);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your email: ");
        //valid email: z3kkadamirli@gmail.com
        String email = sc.nextLine();
        if (validateEmail(email)) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }

        System.out.println("Enter your phone number: ");
        //valid pn: 123-456-7890
        String phoneNumber = sc.nextLine();
        if (validatePhoneNumber(phoneNumber)) {
            System.out.println("Valid Phone Number");
        } else {
            System.out.println("Invalid Phone Number");
        }

        System.out.println("Enter your password: ");
        // valid password: Zek12##!cmd
        String password = sc.nextLine();
        if (validatePassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

        System.out.println("Enter your username: ");
        //valid username: user_123
        String username = sc.nextLine();
        if (validateUsername(username)) {
            System.out.println("Valid Username");
        } else {
            System.out.println("Invalid Username");
        }
    }
}