package Programs;

import java.util.Scanner;

//Q1. Consider there is a 3 Boolean variable called a, b, c. Check if at least two out of three Booleans are true *
public class Q1BooleanVariableCheck {

	public static void main(String[] args) {
		
		System.out.println("Enter 3 Boolean values");
		boolean flaga,flagb,flagc;
		Scanner input=new Scanner(System.in);
		flaga=input.nextBoolean();
		flagb=input.nextBoolean();
		flagc=input.nextBoolean();
		if (flaga== true &&flagb==true) {
			System.out.println(" Two boolean variables are true");
		}
		else 	if (flagb== true &&flagc==true) {
			System.out.println(" Two boolean variables are true");
		}
		else if  (flagc== true &&flaga==true) 
		{
			System.out.println(" Two boolean variables are true");
		}
		else {
			System.out.println("All are false");
		}
			
		
	}

}
