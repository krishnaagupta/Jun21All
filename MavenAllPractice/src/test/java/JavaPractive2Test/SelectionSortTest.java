package JavaPractive2Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import javapractice2.SelectionSort;



public class SelectionSortTest {
	@Test
	public static void test() {
		int [] unsortedsrr=new int [] {6,5,4,3,2,1};
		int[] sortedExpectedArr=new int [] {1,2,3,4,5,6};
		int actualArr[];
		actualArr=SelectionSort.sSort(unsortedsrr) ;
		Assert.assertEquals(actualArr, sortedExpectedArr); 
		for (int i=0;i<actualArr.length;i++) {
			System.out.println(actualArr[i]);
		}
	}
}
