package JavaPractice;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {


	public static int []selectionSort1(int unsortedArr[]){
		int minIndex,temp;
		//int sortedArr[] =new int [unsortedArr.length]; 

		for(int i = 0; i < unsortedArr.length-1; i++) {
			minIndex=i;//set the 1st element as minimum
			for(int j = i+1; j < (unsortedArr.length); j++) {
				if (unsortedArr[minIndex] > unsortedArr[j]) {
					minIndex=j;//set the new min index in this second loop
				}
			}
			temp=unsortedArr[minIndex]; // here exchange the elements
			unsortedArr[minIndex]=unsortedArr[i];
			unsortedArr[i]=temp;	
		}
		return unsortedArr;
	}

	public static ArrayList selectionSortarraylist(ArrayList<Integer> unsortedArr){
		int minIndex,temp;



		for(int i = 0; i < unsortedArr.size()-1; i++) {
			minIndex=i;//set the 1st element as minimum
			for(int j = i+1; j < (unsortedArr.size()); j++) {
				if(unsortedArr.get(minIndex) > unsortedArr.get(j)) {
					minIndex=j;//set the new min index in this second loop
				}
			}

			Collections.swap(unsortedArr, unsortedArr.get(minIndex), unsortedArr.get(i));
		}
		return unsortedArr;
	}

}

