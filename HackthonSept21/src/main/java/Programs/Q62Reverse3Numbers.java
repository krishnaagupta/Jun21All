package Programs;

import java.util.Scanner;

/*Q 62. write an algorithm to reverse first 3 numbers, then next 3 
numbers, then next 3 numbers, the number will be based on var k. 
Array = [3,2,4,7,0,3,1,5,8, 4] k=3 OutPut = [4,2,3,3,0,7,8,5,1,4] */

public class Q62Reverse3Numbers {

	public static void main(String[] args) {
		System.out.println("Enter the array");
		Scanner input= new Scanner (System.in);
		int n=input.nextInt();
		System.out.println("Enter the array");
		int arr[]= new int[n];
		for(int i =0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println("Enter the subset number");
		int k= input.nextInt();

		int m=(arr.length)/k;

		int start=0;
		int end =k-1;	
		for (int i=0;i<m;i++) {

			sort(arr,start,start+3);
			start=end+1;
			end=start+k;

		}

	}
	public static void sort(int arr[],int start, int end) {
		int temp;
		for (int i=start;i<end;i++) {
			for (int j=i+1;j<end;j++) {
				if (arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}

		}

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			System.out.print(",");
		}
	}
}