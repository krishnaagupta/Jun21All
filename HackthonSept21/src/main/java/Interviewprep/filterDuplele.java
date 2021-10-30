package Interviewprep;

import java.awt.List;
import java.util.ArrayList;

//Write code to filter duplicate elements from an array and print as a list?
public class filterDuplele {

	public static void main(String[] args) {
		int arr[]=new int [] {0,1,1,1,3,4,4,5};
	
		ArrayList lis=new ArrayList();
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for (int j=0;j<arr.length;j++) {
				
				if (arr[i]==arr[j]) {
					count++;
				}
			}
			if (count ==1) {
				lis.add(arr[i]);
			}

		}
		System.out.println(lis);

	}

}
