package Task3;



public class AddCourse {
    public static void main(String[] args) {

    }

    private static void updateCourse() {
        throw new InvalidSQLException("Invalid sql query");
    }


    private static class InvalidSQLException extends RuntimeException{
        InvalidSQLException(String message){
            super(message);
        }
    }
}