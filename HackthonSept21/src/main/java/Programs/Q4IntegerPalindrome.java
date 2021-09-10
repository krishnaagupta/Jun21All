package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Q4IntegerPalindrome {

	//Q4. Given an array of integers check the Palindrome of the series. *


	public static void main(String[] args) {
		System.out.println("Enter the array size");
		Scanner input=new Scanner (System.in);
		boolean ispalindrome=false;
		int n=input.nextInt();

		int reversearr1[]=new int[n];
		System.out.println("Enter the array elements");

		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}

		ispalindrome=intArrayReverse(arr);


		if (ispalindrome==true) {
			System.out.println("The integer array is a palindrome");
		}
		else {
			System.out.println("The integer array is not a palindrome");

		}

	}

	public static boolean intArrayReverse(int arr[]) {
		int n = arr.length;
		boolean flag=false;
		int reversearr[]=new int[n];
		for(int i=(n-1);i>=0;i--) {
			n=arr[i];
			reversearr[i]=n;

		}
		for (int j=0;j<(reversearr.length);j++)	{
			System.out.println(reversearr[j]+"-----"+arr[j]);
			if (reversearr[j]==arr[j]) {
				flag=true;
			}
			else {
				flag=false;
			}

		}
		return flag;
	}

}
