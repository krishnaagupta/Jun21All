package JavaPrg;
//Swap two variable with out using third variable 
import java.util.Scanner;

public class SwapWithouttemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		System.out.println("Enter the numbers");
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		b=input.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("numbers"+a);
		System.out.println("numbers"+b);

	}

}
