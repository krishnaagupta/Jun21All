package JavaPrg;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter the a number");
		Scanner input=new Scanner(System.in);
		int n= input.nextInt();
		fact(n);
		int res=factrecur(n);
		System.out.println("resurive result"+res);
	}
	
	public static void fact(int n) {
		int result=1;
		if (n==0) {
			result=1;
		}
		for (int i=1;i<=n;i++){
			result=result*i;
		}
		System.out.println("result"+result);
	}
	public static int factrecur(int n) {
		int result=1;
		if (n==0) {
			result=1;
		}else {
		
			result=n*(factrecur(n-1));	
			
		}
		return result;
		
	}
}
