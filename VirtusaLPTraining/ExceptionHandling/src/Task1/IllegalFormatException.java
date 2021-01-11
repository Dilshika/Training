package Task1;

public class IllegalFormatException extends Exception{
    public IllegalFormatException(String message,Exception exception){

        super(message,exception);
    }
}