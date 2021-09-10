package JavaPrg;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=input.nextInt();
		int unSorted[]=new int [n];
		System.out.println("Enter the elements");
		for ( int i=0;i<unSorted.length;i++) {
			unSorted[i]=input.nextInt();
		}
		
		
		int sorted[]=bubbleSort(unSorted);
		for ( int i=0;i<unSorted.length;i++) {
			System.out.println("Sorted numbers"+sorted[i]);
		}
	}
	public static int[] bubbleSort(int unSorted[]) {
		int temp;
		for(int i=0;i<unSorted.length;i++) {
			for(int j=i+1;j<unSorted.length;j++) {
				if (unSorted[i]>unSorted[j]) {
					temp=unSorted[i];
					unSorted[i]=unSorted[j];
					unSorted[j]=temp;
				}
			}
		}
		return unSorted;
	}
}
