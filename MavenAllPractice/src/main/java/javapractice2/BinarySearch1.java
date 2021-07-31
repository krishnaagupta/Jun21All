package javapractice2;

public class BinarySearch1 {
 public static boolean bSearch(int arr[],int search) {
	boolean found=false;
	int start,mid,end,i;
	start=1;
	end=arr.length;
	i=0;
	while(start<end) {
		mid=(start+end)/2;
		if (search==arr[mid]) {
			found=true;
			break;
		}
		else if(search>arr[mid]){
			start=mid+1;
		}
		else if(search<arr[mid]){
			end=mid-1;
		}
	i++;
	}
	 return found;
 }
}
