package MentorDay18.CustomException;

public class CheckPass {

    public boolean isUpperCase(String pass1) {
        for (char k : pass1.toCharArray()) {
            if (Character.isUpperCase(k)) {
                return true;
            }
        }
        return false;
    }

    public boolean isLowerCase(String pass1) {
        for (char k : pass1.toCharArray()) {
            if (Character.isLowerCase(k)) {
                return true;
            }
        }
        return false;
    }

    public boolean isDigit(String pass1) {
        for (char k : pass1.toCharArray()) {
            if (Character.isDigit(k)) {
                return true;
            }
        }
        return false;
    }


    public void validatePassword(String pass) throws InvalidPasswordException {
        if (pass.length() > 7 && isUpperCase(pass) && isLowerCase(pass) && isDigit(pass)) {
            System.out.println("Password is strong");
        } else {
            throw new InvalidPasswordException("Weak password");
        }
    }
}
