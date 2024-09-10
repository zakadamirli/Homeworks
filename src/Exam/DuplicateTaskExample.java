package Exam;

public class DuplicateTaskExample extends Exception {

    public DuplicateTaskExample(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
