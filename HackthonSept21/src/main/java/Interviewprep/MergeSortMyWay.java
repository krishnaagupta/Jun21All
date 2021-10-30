package Interviewprep;

public class MergeSortMyWay {

	public static void main(String[] args) {
		//int crr[]=new int[] {3,9,6,0,1,2};
		int crr[]=new int[] {3,9,1,2,6,7,8};
		mergesort(crr);
		for(int i=0;i<crr.length;i++) {
			System.out.println("result"+crr[i]);
		}
	}		
	public static void mergesort(int crr[]) {
	int len=crr.length;
	int mid=len/2;
	if (len< 2)
	{
		return ;// even though the methoos is void the return here just exits the code 
	}
	int k=0;
	int left []=new int [mid];
	int right[]=new int[len-mid];
	for (int i=0;i<len;i++) {
		if (i<mid) {
			left[i]=crr[i];
		}
		else {
			right[k]=crr[i];
			k++;
		}
	}
	mergesort(left);
	mergesort(right);
	merge(left,right,crr);
	}
	public static void  merge (int left[],int right[],int crr[]) {
		int i=0,j=0,k=0;
		while (i<left.length && j<right.length) {
			if (left[i]<right[j]) {
				crr[k]=left[i];
				i++;
			}
			else {
				crr[k]=right[j];
				j++;
			}
			k++;
		}
		while (i<left.length) {
			crr[k]=left[i];
			i++;
			k++;
		}
		while (j<right.length) {
			crr[k]=right[j];
			j++;
			k++;
		}
	}


}


