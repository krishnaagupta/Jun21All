package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectionSortTest {
	@Test
	public static void SimpleTest() {
		int unsortedArr[]= new int [] {5,4,2,3,1};
		int expectedArr[] = new int [] {1,2,3,4,5};
		
		
		int sortedArr[]=SelectionSort.selectionSort1(unsortedArr);
		Assert.assertEquals(sortedArr, expectedArr);
		
		
	}	
	@Test
	public static void SimpleTest1() {
		int expectedArr1[] = new int [] {1,2,3,4,6};
		int unsortedArr[]= new int [] {5,4,2,3,1};
		
	
		int sortedArr[]=SelectionSort.selectionSort1(unsortedArr);
		Assert.assertNotEquals(sortedArr, expectedArr1);	
	}	
	
	@Test
	public static void SimpleTest2() {
	
		ArrayList<Integer> list1=new ArrayList();
		Arrays.asList(5,4,3,2,1);
		ArrayList<Integer> expected=new ArrayList();
		Arrays.asList(1,2,3,4,5);
		
		ArrayList sortedArr =SelectionSort.selectionSortarraylist(list1);
		Assert.assertEquals(sortedArr, expected);	
	}
	public static void main(String[] args) {
		
	}	
}
