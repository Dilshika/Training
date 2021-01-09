import java.util.Scanner;

public class NumberReverse{
	public static void main(String []args){
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter any number");
	long number=scanner.nextLong();

	System.out.println("Reversed Number:");

	if(number==0){
	System.out.print(number);	//Input is zero
	}

	if(number<0){		//Number is negative
	while(number!=0){

	long remainder=number%10;  	//To achieve the last digit of the number
	System.out.print(remainder);
	number=-number/10;		//Remove the printed digit

	}
	}
	while(number!=0){

	long remainder=number%10;  	//To achieve the last digit of the number
	System.out.print(remainder);
	number=number/10;		//Remove the printed digit

	}
		
	}
}