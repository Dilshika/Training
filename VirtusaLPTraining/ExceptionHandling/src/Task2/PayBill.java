package Task2;

import java.util.Scanner;

public class PayBill {
    public static void main(String[] args) {
        int total = 1000;
        try {
            calculateAmount(total);
            printBill(false);

        }catch (Exception exception){

            //Print Stack Trace Information
            System.err.printf("%s%n%n", exception.getMessage());
            exception.printStackTrace();

            //Obtain Stack Trace information
            StackTraceElement[] traceElements=exception.getStackTrace();
            System.out.printf("%nStack trace from getStackTrace:%n");
            System.out.println("Class\t\tFile\t\t\tLine\tMethod");

            //loop through traceElements to get exception description
            for(StackTraceElement element:traceElements) {
                System.out.printf("%s\t", element.getClassName());
                System.out.printf("%s\t", element.getFileName());
                System.out.printf("%s\t", element.getLineNumber());
                System.out.printf("%s\t", element.getMethodName());
            }
        }

    }

    private static void calculateAmount(int total) throws ArithmeticException {

        Scanner scanner=new Scanner(System.in);
        int billAmount=0;
        System.out.println("Enter the tax amount:");
        int taxAmount=scanner.nextInt();
        if(taxAmount==0){
            throw new ArithmeticException("Tax amount cannot be zero");
        }else{
            int tax=total/taxAmount;
            billAmount=total+tax;
        }
    }

    private static void printBill(boolean printerAvail) throws ResourceNotFound{
        if(printerAvail){}
        throw new ResourceNotFound("Printer not found");
    }


    private static class ArithmeticException extends RuntimeException { //unchecked exception
        public ArithmeticException(String message){
            super(message);
        }
    }
    private static class ResourceNotFound extends Exception{    //checked exception
        public ResourceNotFound(String message){
            super(message);
        }
    }
}