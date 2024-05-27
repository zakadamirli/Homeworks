package MentorDay03;

import java.util.Scanner;

public class SignIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String userNm = sc.next();
        System.out.print("Enter your password: ");
        String pass = sc.next();
        if (userNm.equals("admin") && pass.equals("12345")) {
            System.out.println("You are logged in");
        } else {
            System.out.println("You are not logged in");
        }
    }
}
