package Interviewprep;

import java.util.Scanner;

public class Fibonacirecurandnonrecu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("enter the number for which u wan the factorial");
		int n= input.nextInt();
		 //fibonaci(n);
		
		for (int i=0;i< n;i++) {
			System.out.println(recurfibonaci(i));
		}
		
		
		
	}
public static void fibonaci(int n) {
	int n1=0;
	int n2=1;
	System.out.println(n1);
	System.out.println(n2);
	for (int i=2;i<n;i++) {
		int n3=n1+n2;
		System.out.println(n3);
	n1=n2;
	n2=n3;
	
	}
}


	public static int recurfibonaci(int n) 
	{

	    if (n <= 1) {
	        return n;
	        }
	    return recurfibonaci(n-1) + recurfibonaci(n-2);
		
		}
			
}

