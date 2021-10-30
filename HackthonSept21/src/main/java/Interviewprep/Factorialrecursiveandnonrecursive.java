package Interviewprep;

import java.util.Scanner;

public class Factorialrecursiveandnonrecursive {
	public static void main(String args[]) {
	
	Scanner input =new Scanner(System.in);
	System.out.println("enter the number for which u wan the factorial");
	int n= input.nextInt();
	//int result= factorial(n);
	int  result=fact(n);
	System.out.println("result"+result);
}
	public static int factorial(int n) {
		int res=1;
		for (int i=1;i<=n;i++) {
			res=res*i;
		}
		return res;
		
	}
	public static int fact(int n) {
		int res=1;
		if (n==0) {
			return res=1;
		}
		else {
			return res=n*fact(n-1);
			
		}
		
		
	}
	

}