package JavaPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BubbleSortTest {

	@Test
	public void test1() {
		
		// no duplicate
		int input[]=new int[] {5,3,7,2,1};
		int expected []=new int[] {1,2,3,5,7};
		int actual []=BubbleSort.bubblesort(input);
		
		Assert.assertEquals(actual, expected);
		
		// with duplicates
		input=new int[] {4,8,4,7,0,1};
		expected=new int[] {0,1,4,4,7,9};
		actual=BubbleSort.bubblesort(input);
		
		Assert.assertEquals(actual, expected);
		
	}
	

}
