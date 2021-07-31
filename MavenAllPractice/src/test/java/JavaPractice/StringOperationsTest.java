package JavaPractice;

import java.util.Set;

import org.testng.annotations.Test;

public class StringOperationsTest {

	@Test
	public void test() {
		String inputStr="hi hi how are hi hello are you ok";
		Set<String> actual = Stringoperations.uniqueWordsOfString(inputStr);
		System.out.println(actual);
	}
}
