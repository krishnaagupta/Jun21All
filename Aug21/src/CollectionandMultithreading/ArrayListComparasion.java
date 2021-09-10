package CollectionandMultithreading;

import java.util.ArrayList;

//Write a Java program to compare two array lists
public class ArrayListComparasion {

	public static void main(String[] args) {
		ArrayList<Integer> arr1=new ArrayList();
		ArrayList<Integer> arr2=new ArrayList();
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		
		arr2.add(1);
		arr2.add(2);
		arr2.add(3);
		arr2.add(5);
		arr2.add(5);
		if (arr1.equals(arr2)) {
			System.out.print("equal");
		}
		else {
			System.out.println("not equal");
		}
		
		
	
	}

}
