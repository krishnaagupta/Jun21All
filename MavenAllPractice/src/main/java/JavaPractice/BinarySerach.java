package JavaPractice;

public class BinarySerach {


	public static boolean binarysearch(int arr[],int ele) {
		boolean found =false;
		int mid ,start=0,end= arr.length-1;
		
		while(start<end) {
			mid=(start+end) /2;
			if (ele==arr[mid]) {
				System.out.println("Element founr at location"+arr[mid]);
				found=true;
				break;	
			}
			else if (ele<arr[mid]) {
				end =mid-1;
			}
			else  {
				start=mid+1;
			}
		}

		return found ;
	}
}
