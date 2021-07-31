package JavaPractive2Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import javapractice2.StringOps;

public class StringopsTest {
	//@Test
	public static void test1() {
		String intputStr="Apple",revString="elppA",actual="";	
		actual=StringOps.stringRev(intputStr);
		System.out.println(actual);
		Assert.assertEquals(actual, revString);

	}
	//@Test
	public static void test2() {
		String intputStr="Apple in the sun",revString="sun the in Apple",actual="";	
		actual=StringOps.stringRevWord(intputStr);
		System.out.println(actual);
		Assert.assertEquals(actual, revString);
	}
	//@Test
	public static void test3() {
		String intputStr="Apple";	
		boolean flagExpected=false;
		boolean flagactual=StringOps.palindrome(intputStr);
		System.out.println(flagactual);
		Assert.assertEquals(flagactual, flagExpected);
		
		String inputStr1="mom";
		boolean flagExpected1=true;
		boolean flagactual1=StringOps.palindrome(inputStr1);
		System.out.println(flagactual1);
		Assert.assertEquals(flagactual1, flagExpected1);

	}
	@Test
		public static void test4() {
		String input1="mary",input2="army";
		boolean expected=true,actual;
		actual=StringOps.isAnagram(input1, input2);
		Assert.assertEquals(actual, expected);
		
		input1="try";
		input2="cry";
		expected=false;
		actual=StringOps.isAnagram(input1, input2);
		Assert.assertEquals(actual, expected);
	}
}
