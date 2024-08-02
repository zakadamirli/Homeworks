package MentorDay18.CustomException;

public class Main {
    public static void main(String[] args) {
        CheckPass checkPass = new CheckPass();

        try {
            checkPass.validatePassword("password123");
        } catch (InvalidPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            checkPass.validatePassword("Password123");
        } catch (InvalidPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
