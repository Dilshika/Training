package Task1;

public class EmptyStringException extends Exception {
    public EmptyStringException(String message,Exception exception) {
        super(message,exception);
    }
}
