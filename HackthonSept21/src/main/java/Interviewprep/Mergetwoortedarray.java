package Interviewprep;

public class Mergetwoortedarray {

	public static void main(String[] args) {
		//int mrr[]=new int [] {1,3,5,7,2,4,6,8};
		int arr[]= new int[] {1,3,5,7};
		int brr[]= new int[] {2,4,6,8,10};

		int[] ret = mergearray(arr, brr);
		for (int i=0;i<ret.length;i++) {
			System.out.println("ret arr="+ret[i]);
		}
	}

	//public static int mergearray( int arr[],int brr[]) {
	public static int[] mergearray(int arr[], int brr[])	{
		int crr[]=new int[arr.length+brr.length];
		int i=0,j=0,k=0;
		while( i<arr.length &&  j<brr.length) 
		{
			int l=arr[i];
			int r=brr[j];
			if (l<r) {
				crr[k]=l;
				i++;
			}
			else  {
				crr[k]=r;
				j++;
			}
			k++;
		}
		while (i<arr.length) {
			crr[k]=arr[i];
			i++;
			k++;
		}
		while (j<brr.length) {
			crr[k]=brr[j];
			j++;
			k++;
		}

		return crr;
	}

}
