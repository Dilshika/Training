package Task1;
import java.util.Scanner;

public class UserRegistration {
    public static void main(String []args) {

        try{
            nameValidation();           //call nameValidation method

        } catch(EmptyStringException exception){    //catch exception throws in nameValidation

            //Print Stack Trace Information
            System.err.printf("%s%n%n", exception.getMessage());
            exception.printStackTrace();

        }
    }
    public static void nameValidation() throws EmptyStringException{
        try {
            phoneNumberValidation();
        }catch(IllegalFormatException exception) {
            throw new EmptyStringException("Name cannot be Empty",exception);
        }

    }
    public static void phoneNumberValidation() throws IllegalFormatException {
        try {
            emailValidation();
        } catch (InvalidFormatException exception){
        throw new IllegalFormatException("Telephone number cannot be exceed 10 digits or empty",exception);
        }
    }
    public static void emailValidation() throws InvalidFormatException {
        try {
            selectCourse();
        } catch (EmptyInputException exception) {
            throw new InvalidFormatException("Email format is Invalid",exception);
        }
    }
    public static void selectCourse() throws EmptyInputException{
       throw new EmptyInputException("Course cannot be empty");
    }



}
