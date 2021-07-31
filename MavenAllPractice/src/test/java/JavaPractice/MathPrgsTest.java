package JavaPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MathPrgsTest {
	@Test
	public  void test1 () {

		boolean expectedFlag,returnedFlag;
		expectedFlag=true;
		returnedFlag=MathPrgs.boolChk(true, true, true);
		Assert.assertEquals(returnedFlag, expectedFlag);

		expectedFlag=true;
		returnedFlag=MathPrgs.boolChk(true, false, true);
		Assert.assertEquals(returnedFlag, expectedFlag);

		expectedFlag=true;
		returnedFlag=MathPrgs.boolChk(false, true, true);
		Assert.assertEquals(returnedFlag, expectedFlag);

		expectedFlag=true;
		returnedFlag=MathPrgs.boolChk(true, true, false);
		Assert.assertEquals(returnedFlag, expectedFlag);

		expectedFlag=false;
		returnedFlag=MathPrgs.boolChk(false, true, false);
		Assert.assertEquals(returnedFlag, expectedFlag);

		expectedFlag=false;
		returnedFlag=MathPrgs.boolChk(false, false, false);
		Assert.assertEquals(returnedFlag, expectedFlag);
	}

	@Test
	public void test2() {
		boolean expected= false;
		boolean check=MathPrgs.palindromeNumber(123);
		Assert.assertEquals(check, expected);	

		expected= true;
		check=MathPrgs.palindromeNumber(545);
		Assert.assertEquals(check, expected);	
	}
// WJP to find total number of integers, uppercase and lowercase character in the give string *
	@Test
	public void test3() {
		int expectedCount=16,actualCount=0;
		actualCount=MathPrgs.totalNumber("Hello How are you 23");
		
		Assert.assertEquals(expectedCount, actualCount);	
	}
}