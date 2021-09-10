package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Given an array prints the unique numbers and also print the number of 
//occurrences of duplicate numbers. *
public class Q5Uniqueoccurrence {

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
		Map<Integer,Integer>map1=new HashMap<Integer,Integer>();
		for (int i=0;i<arr.length;i++) {
			map1.put(arr[i], map1.getOrDefault(arr[i], 0)+1);
		}
		System.out.println(map1);
	}

}
