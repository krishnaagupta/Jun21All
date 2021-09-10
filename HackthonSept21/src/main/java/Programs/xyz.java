package Programs;

import java.util.Scanner;

public class xyz {
	public static void main(String[] args) {
		System.out.println("Enter the array");
		Scanner input= new Scanner (System.in);
		int n=input.nextInt();
		System.out.println("Enter the array");
		int arr[]= new int[n];
		for(int i =0;i<n-2;i++) {
			arr[i]=input.nextInt();
		}
}
