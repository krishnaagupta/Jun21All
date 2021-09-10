package Programs;

import java.util.Scanner;

//Q6. WJP to perform ascending order Selection sort *
public class Q6SelectionSortAssending {

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
		int sortedarr[]=new int[n];
		System.out.println("sorted array");
		sortedarr=SelectionSortAssending(arr);
		for(int i=0;i<n;i++) {
			System.out.print(sortedarr[i]+",");
		}
	}
	public static int []SelectionSortAssending(int arr[]){
		int minindex,temp;
		for(int i=0;i<arr.length-1;i++) {
			for (int j=i+1;j<arr.length;j++) {
				minindex=i;
				if (arr[j]<arr[minindex]) {
					minindex=j;
				}
				temp=arr[i];
				arr[i]=arr[minindex];
				arr[minindex]=temp;
			}
		}

		return arr;	
	}
}

