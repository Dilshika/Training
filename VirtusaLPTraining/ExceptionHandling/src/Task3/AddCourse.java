package Task3;



public class AddCourse {
    public static void main(String[] args) {
        try{
            updateCourse();
        }catch(InvalidSQLException exception){
            throw new RuntimeException(exception);  //Wrapped as unchecked Exception
        }
    }

    private static void updateCourse() throws InvalidSQLException {
        throw new InvalidSQLException("Invalid sql query");
    }


    private static class InvalidSQLException extends Exception{
        InvalidSQLException(String message){
            super(message);
        }
    }
}