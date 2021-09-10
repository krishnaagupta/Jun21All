package JavaPrg;

import java.util.Scanner;

//3.WJP to print Fibonacci series using For loop
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the end number  fibonaci series");
		Scanner input= new Scanner(System.in);
		int a= input.nextInt();
		int n1=0,n2=1;
		for (int i=1;i<=a;i++) {
			System.out.print(n1+",");
			int prev=n1+n2;
			n1=n2;
			n2=prev;
		}

	}

}
