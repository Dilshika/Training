import java.util.Scanner;
public class NumberReverse{
	public static void main(String []args){

	long reverse=0;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter any number");
	long number=scanner.nextLong();
	
	while(number!=0){
	reverse=reverse*10;	 	//To achieve the reversed number
	reverse=reverse+number%10;  	//To achieve the last digit of the number and add to the reversed number
	number=number/10;		//Remove the printed digit
	}
	System.out.print("Reversed Number:"+reverse);
	}	
	
}