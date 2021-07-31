package JavaPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BinarySearch {

	@Test
	public void simpleTest() {
		int inputArr []= {1,2,3,4,5};
		int sortedArr[]=BubbleSort.bubblesort(inputArr);
		boolean flag=BinarySerach.binarysearch(sortedArr, 4);
		Assert.assertEquals(flag, true);

		flag=BinarySerach.binarysearch(sortedArr, 6);
		Assert.assertEquals(flag, false);
	}
}

 