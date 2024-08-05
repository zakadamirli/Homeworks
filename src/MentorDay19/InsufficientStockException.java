package MentorDay19;


public class InsufficientStockException extends Exception {
    public InsufficientStockException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
