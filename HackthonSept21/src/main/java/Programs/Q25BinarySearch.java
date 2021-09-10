package Programs;

import java.util.Scanner;

//Q25. Write a program for binary search. And 5 i/p has to take from user as binary elements. *
public class Q25BinarySearch {

	public static void main(String[] args) {
		System.out.println("Enter the number of elements");
		Scanner input=new Scanner (System.in);
		int num=input.nextInt();
		int arr[]=new int [num];
		System.out.println("Enter the  sorted array elements");
		for (int i=0;i<num;i++)
		{
			arr[i]=input.nextInt();
		}
		System.out.println("Element to be found");
		int ele=input.nextInt();

		boolean found=binarySeacrh(arr,ele);
		if (found==true) {
			System.out.println("Element  found");
		}else
		{
			System.out.println("Element  not found");
		}
	}
	public static boolean binarySeacrh(int arr[],int ele) {
		boolean found=false;
		int start=0,end=arr.length-1;
		int mid=(start+end)/2;
		while( start<=end) {

			if (arr[mid]==ele) {
				found=true;
				break;
			}
			else if (ele <arr[mid]) {
				end=mid-1;
			}
			else if (ele >arr[mid]) {
				start=mid+1;
			}
			mid=(start+end)/2;
		}
		return found ;

	}
}
