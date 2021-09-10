package JavaPrg;
//selection sort:-> find the smallest element and replace it.so seqyentially in this case start with 5 and replace it withone.
public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {5,6,2,9,1};
		int sorted[]= new int[arr.length];
		sorted=SSort(arr);
for(int i=0;i<arr.length;i++) {
	System.out.println(sorted[i]);
}
	}
public static int[] SSort(int arr[]) {
	int sorted[]=new int[arr.length];
int minndex,temp;
for (int i=0;i<arr.length-1;i++) {
	minndex=i;
	for (int j=i+1;j<arr.length;j++) {
		if (arr[j]<arr[minndex]) {
			minndex=j;
		}
	}
	temp=arr[minndex];
	arr[minndex]=arr[i];
	arr[i]=temp;
}
	
	return arr;
}
}
