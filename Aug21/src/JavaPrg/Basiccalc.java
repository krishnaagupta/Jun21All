package JavaPrg;

import java.util.Scanner;

//e a java program to perform calculator operation
public class Basiccalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,result;
		char operator;
		System.out.println("Enter two numbers");
		Scanner input=new Scanner(System.in);
		a = input.nextInt();
		b= input.nextInt();
		Scanner input1=new Scanner(System.in);
		operator=input.next().charAt(0);
		System.out.println("Select the operation");
		switch (operator){

		case '+':
			result = a + b;
			System.out.println(a + " + " + b + " = " + result);

			break; 

		case '-':
			result = a - b;
			System.out.println(a + " - " + b + " = " + result);

			break; 
		case '*':
			result = a *b;
			System.out.println(a + " * " + b + " = " + result);

			break; 
		case '/':
			result = a / b;
			System.out.println(a + " /" + b + " = " + result);

			break; 
		}
	}

}
