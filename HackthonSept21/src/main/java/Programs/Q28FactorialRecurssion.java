package Programs;

import java.util.Scanner;

//Q28. WJP to find factorial of a number using recursion *
public class Q28FactorialRecurssion {

	public static void main(String[] args) {
		System.out.println("Enter the number to calculate factorial");
		Scanner input=new Scanner(System.in);
		int num= input.nextInt();
		int res;
		res=fact(num);
		System.out.println("The Factorial result is "+res);

	}
	public static int fact (int n) {
		int res=1;
		if (n==0) {
			return res;
		}
		else {
			return res=(n*fact(n-1));
		}

	}
}