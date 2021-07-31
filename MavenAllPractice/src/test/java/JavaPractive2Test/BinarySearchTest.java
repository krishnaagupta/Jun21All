package JavaPractive2Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import javapractice2.BinarySearch1;

public class BinarySearchTest {
	@Test
	public static void  test() {	
		int input[]= new int[]{1,2,3,4,5};
		int search= 4;
		boolean found=false;
		found=BinarySearch1.bSearch(input,4);
		boolean expectedfound= true;
		Assert.assertEquals(found, expectedfound);
		
		found=BinarySearch1.bSearch(input,6);
		expectedfound= false;
		Assert.assertEquals(found, expectedfound);
	}
}
