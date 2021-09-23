package JavaPrg;

public class Merge2arayintonewArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,5,7};
		int brr[]= {2,4,6,8};

		int len=arr.length+brr.length;
		int crr[]=new int[arr.length+brr.length];
		crr=merge(arr,brr,crr);




		for (int o=0;o< crr.length;o++) {
			System.out.print(crr[o]+",");
		}
	}

	
	public static int[] merge(int arr[],int brr[],int crr[]) {
		int i=0,j=0,k=0;

		while (i < arr.length&& j<brr.length) {
			if (arr[i]<brr[j]) {
				crr[k]=arr[i];
				i++;


			}
			else if (brr[j]<arr[i]) {
				crr[k]=brr[j];
				j++;


			}
			k++;
		}
		System.out.print (i+","+j+"--");
		while (i<arr.length)
		{
			crr[k]=arr[i];
			i++;
			k++;
		}
		while (j<brr.length)
		{
			crr[k]=brr[j];
			j++;
			k++;

		}
		return crr;
	}
}

