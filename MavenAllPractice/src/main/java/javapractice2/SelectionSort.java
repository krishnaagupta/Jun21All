package javapractice2;

public class SelectionSort {
public static int [] sSort(int arr[]) {
int i,minindex,j;
for(i=0;i<arr.length;i++) {
	minindex=i;//set the min index to i first element
	for(j=i+1;j<arr.length;j++) {
		if (arr[minindex]>arr[j]) {
			minindex=j;// compare minindex to all elements
			
		}
	int temp=arr[i];
	arr[i]=arr[minindex];
	arr[minindex]=temp;
	}
}
	
return arr;	
}
}
