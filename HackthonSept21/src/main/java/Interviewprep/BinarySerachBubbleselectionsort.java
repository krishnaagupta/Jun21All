package Interviewprep;

import java.util.Scanner;

public class BinarySerachBubbleselectionsort {

	public static void main(String[] args) {

		int n=5,ele;
		int arr[] = new int [n];

		Scanner input=new Scanner(System.in);
		System.out.println("Enter the array");		

		for (int i=0;i<n;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println("Enter the ele to be searched");
		ele=input.nextInt();
		//int brr[]= bubblesortedArray(arr); // code for bubble sort
		int brr[]= selectionsortedArray(arr); // code for selction sort
		display(arr);
		boolean found =binarySearch(brr,ele);	
		System.out.println("element is "+found);

	}



	public static int [] bubblesortedArray(int arr[]) {

		for(int i=0;i< arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				int temp;
				if (arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		return arr;
	}
	public static int [] selectionsortedArray(int arr[]) {

		for(int i=0;i< arr.length-1;i++) {// point is diff bubble sort
			for (int j=i+1;j<arr.length;j++) {/// point is diff from bubble sort
				int minindex=i;
				if (arr[j]<arr[i]) {
					minindex=j;
				}
				int temp=arr[i];
				arr[i]=arr[minindex];
				arr[minindex]=temp;	

			}
		}

		return arr;
	} static void display(int brr[]) {
		for (int i=0;i<brr.length;i++) {
			System.out.println("arrar->"+brr[i]);
		}
	}





	public static boolean binarySearch(int arr[],int ele)
	{

		boolean found=false;
		int start=0, end = arr.length-1,pos=0;
		int mid= (start+end)/2;
		while(start<=end) {

			if (arr[mid]==ele) {
				found =true;
				pos=mid;
				break;
			}
			else if (ele>arr[mid]){
				start=mid+1;
			}
			else if (ele<arr[mid]){
				end=mid-1;
			}
			mid=(start+end)/2;// was missing this step
		}
		System.out.println("position"+ pos);
		return found;


	}
}
