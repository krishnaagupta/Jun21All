package JavaPrg;
//WJP to check if a number entered is negative
import java.util.Scanner;

public class CheckForNegative {

	public static void main(String[] args) {
		float a,b;
		System.out.println("Enter two numbers one positive and one negative.");
		Scanner input=new Scanner(System.in);
		a = input.nextFloat();
		b=input.nextFloat();
		if (a>0) {
			System.out.println(a+" is a  positive number");	
		}
		else{
			System.out.println(a+" is a  negative number");	
		}

		if (b>0) {
			System.out.println(b+" is a positive number");	
		}
		else{
			System.out.println(b+" is a  negative number");	
		}
	}
}
