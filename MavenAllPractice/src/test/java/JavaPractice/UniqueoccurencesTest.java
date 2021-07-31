package JavaPractice;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UniqueoccurencesTest {
	@Test
	public void test1() {
		int inputArray []=new int [] {1,2,3,4,4,5,6,6};
		HashMap <Integer,Integer>outputMap=new HashMap();
		HashMap <Integer,Integer>expectedMap=new HashMap();
		expectedMap.put(1, 1);
		expectedMap.put(2, 1);
		expectedMap.put(3, 1);
		expectedMap.put(4, 2);
		expectedMap.put(5, 1);
		expectedMap.put(6, 2);
		outputMap=UniqueOccurences.uniqueOccurenceArray(inputArray);		
		Assert.assertEquals(outputMap, expectedMap);
	}

	@Test
	public void test2() {
		String inputArray []=new String [] {"Hello","Hello","Hi","hi","aa","aa","bb"};
		HashMap <String,Integer>outputMap=new HashMap();
		HashMap <String,Integer>expectedMap=new HashMap();
		expectedMap.put("Hello", 2);
		expectedMap.put("Hi", 1);
		expectedMap.put("hi", 1);
		expectedMap.put("aa", 2);
		expectedMap.put("bb", 1);

		outputMap=UniqueOccurences.uniqueOccurenceWord(inputArray);		
		Assert.assertEquals(outputMap, expectedMap);
	}
	@Test
	public void test3() {
		String InputStr= "How are you H.";
		HashMap <Character,Integer>outputMap=new HashMap();
		HashMap <Character,Integer>expectedMap1=new HashMap<Character,Integer>();
		expectedMap1.put('H', 2);
		expectedMap1.put('o', 2);
		expectedMap1.put('w', 1);
		expectedMap1.put('a', 1);
		expectedMap1.put('r', 1);
		expectedMap1.put('e', 1);
		expectedMap1.put('y', 1);
		expectedMap1.put('u', 1);
		expectedMap1.put('.', 1);
		expectedMap1.put(' ', 3);
		outputMap=UniqueOccurences.duplicateLetters(InputStr);
		System.out.println(outputMap);
		Assert.assertEquals(outputMap, expectedMap1);
		
		Map.Entry<Character,Integer>actual = UniqueOccurences.maxOccurence(outputMap);
		
		Assert.assertEquals(actual.getKey().charValue(),' ');
		Assert.assertEquals(actual.getValue().intValue(), 3);
	}
	
}
