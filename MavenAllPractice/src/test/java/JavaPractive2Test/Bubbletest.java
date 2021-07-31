package JavaPractive2Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import javapractice2.Bubblesort;

public class Bubbletest {
@Test
	public static void test () {
	int input[]=new int[] {5,3,7,2,1};
	int expected[]= new int[]{1,2,3,5,7};
	int actual[]=Bubblesort.bsort(input);
	for (int i=0;i<actual.length;i++) {
		System.out.println("sdf"+actual[i]);
	}
Assert.assertEquals(actual, expected);
}
}
