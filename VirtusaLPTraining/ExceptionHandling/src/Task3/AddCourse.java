package Task3;


import java.sql.SQLException;

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


    private static class InvalidSQLException extends SQLException{
        InvalidSQLException(String message){
            super(message);
        }
    }
}