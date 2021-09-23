package Programs;
// You are given two sorted arrays, A and B, and A has a large enough bu#er
//at the end to hold B. Write a method to merge B into A in sorted order. *
public class Q32mergeTwoSortedArray {

	public static void main(String[] args) {
		int arr[]=new int[] {1,3,5,7,0,0,0,0};
		int brr[]=new int [] {2,4,6,8};
		sortMerge(arr,brr);
		printArray(arr);

	}
public static void sortMerge(int arr[],int brr[]) {
	for (int i=0;i< arr.length;i++) {
	//	if (arr[i]>)
	}
}
	public static void printArray(int[] arr) {
		for(int i=0;i< arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
