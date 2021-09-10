package JavaPrg;

import java.util.List;
import java.util.Scanner;
//Write a java program to perform calculator operation (arithmetic +,-,* and / ) using switch case and methods(functions)
public class Calculator {
	public static void main(String[] args) {
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
			//			 result = a + b;
			//		        System.out.println(a + " + " + b + " = " + result);
			add(a,b);
			break; 

		case '-':
			//result = a - b;
			// System.out.println(a + " - " + b + " = " + result);
			sub(a,b);
			break; 
		case '*':
			//result = a *b;
			//System.out.println(a + " * " + b + " = " + result);
			mul(a,b);
			break; 
		case '/':
			//result = a / b;
			// System.out.println(a + " /" + b + " = " + result);
			div(a,b);
			break; 
		}
	}
	public static void add(int a,int b) {
		int result = a + b;
		System.out.println(a + " + " + b + " = " + result);
	}

	public static void sub(int a,int b) {
		int result = a - b;
		System.out.println(a + " - " + b + " = " + result);
	}

	public static void mul(int a,int b) {
		int result = a * b;
		System.out.println(a + " *" + b + " = " + result);
	}
	public static void div(int a,int b) {
		int result = a / b;
		System.out.println(a + " /" + b + " = " + result);
	}

}