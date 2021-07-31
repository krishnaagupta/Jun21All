package JavaPractive2Test;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

import javapractice2.NumberOps;

public class NumberOpsTest {
	//@Test
	public static void test1() {
		int input=123,expected=321,actual;
		actual=NumberOps.numRev(input);
		Assert.assertEquals(actual, expected);
		System.out.println(actual);
		System.out.println(expected);
		System.out.println(actual+"-"+expected);
	}
	//@Test
	public static void test2() {
		int input=123;
		boolean actualFlag,expectedFlag=false;
		actualFlag=NumberOps.numPalindrome(input);
		Assert.assertEquals(actualFlag, expectedFlag);

		input=121;
		expectedFlag=true;
		actualFlag=NumberOps.numPalindrome(input);
		Assert.assertEquals(actualFlag, expectedFlag);
	}
	//@Test
	public static void test3() {
		int input=10,actualarr[];
		int expectedArr []= new int[] {0, 1, 1 ,2, 3, 5, 8 ,13, 21, 34};
		actualarr=NumberOps.Fibonacciseries(input);
		for (int i=0;i<actualarr.length;i++) {
			System.out.println(actualarr[i]);
		}
		Assert.assertEquals(actualarr, expectedArr);
	}

	//@Test
	public static void test4() {
		int input=29;
		boolean expected=true,actual;
		actual=NumberOps.PriimeNumbers(input);
		Assert.assertEquals(actual, expected);

		input=25;
		expected=false;
		actual=NumberOps.PriimeNumbers(input);
		Assert.assertEquals(actual, expected);


	}
	//@Test
	public static void test5() {
		int input= 153;
		boolean expected=true,actual;
		actual=NumberOps.armstrongnumbers(input);
		Assert.assertEquals(actual, expected);

		input= 123;
		expected=false;
		actual=NumberOps.armstrongnumbers(input);
		Assert.assertEquals(actual, expected);

	}
	//@Test
	public static void test6() {
		int input []=new int[] {1,1,2,3,3,4,5,6,7,7};
		//ArrayList Expected=new ArrayList();
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5,6,7));
		ArrayList<Integer> actual = new ArrayList();
		actual=NumberOps.revomeDuplicate(input);		
		Assert.assertEquals(actual,expected);
	}
	@Test
	public static void test7() {
		int input1=12,intput2=24;
		int actualLcm,ActualGcf,expectedLcm=24 ,expectedGcf=12;
		actualLcm=NumberOps.lcm(input1, intput2);
		Assert.assertEquals(actualLcm, expectedLcm);

		ActualGcf=NumberOps.gcf(input1, intput2);
		Assert.assertEquals(ActualGcf, expectedGcf); 
	}
}