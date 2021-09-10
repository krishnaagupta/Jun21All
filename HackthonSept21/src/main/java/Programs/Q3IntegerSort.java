package Programs;

import java.util.Scanner;

//Q3. Given an array of integers, sort the integer values. *
public class Q3IntegerSort {

	public static void main(String[] args) {
		System.out.println("Enter the array size");
		Scanner input=new Scanner (System.in);
		int n=input.nextInt();
		System.out.println("Enter the array elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		int sorted[]=new int[n];
		sorted= bubbleSort(arr);

		System.out.println("Sorted array elements");
		for(int i=0;i<n;i++) {
			System.out.print(sorted[i]+",");

		}
	}
	public static int[] bubbleSort(int arr[]){
		int temp;
		for (int i=0;i<arr.length;i++) {

			for(int j=i+1;j<arr.length;j++) {
				if (arr[i]>arr[j] ){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		return arr;

	}
}
