package JavaPractice;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		int i, n,j;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter ele");

		n =input.nextInt();
		int []arr=new int[n];
		System.out.println("Enter array");
		for (i=0;i<n;i++) {
			arr[i]=input.nextInt();	
		}
		bubblesort(arr);
	}

	public static int [] bubblesort(int arr[]) {
		int i,j,temp;
		//int  resultArr[]=new int[arr.length];
		for (i=0;i<arr.length;i++) {
			for (j=i+1;j<arr.length;j++) {
				if (arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}

		}
		return arr;
	}

}
