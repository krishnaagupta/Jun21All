package JavaPractice;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UniqueOccurences {

	public static HashMap uniqueOccurenceArray(int inputArr[]) {
		HashMap<Integer,Integer>map1=new HashMap();
		for (int i = 0;i < inputArr.length; i++) {
			map1.put(inputArr[i], (map1.getOrDefault(inputArr[i], 0)+1));
		}
		return map1;
		
	}
	public static HashMap uniqueOccurenceWord(String inputArr[]) {
		HashMap<String,Integer>map1=new HashMap();
		for (int i = 0;i < inputArr.length; i++) {
			map1.put(inputArr[i], (map1.getOrDefault(inputArr[i], 0)+1));
		}
		return map1;
		
	}
	public static HashMap duplicateLetters(String InputStr) {
		HashMap<Character,Integer> outputMap=new HashMap();
		for (int i = 0;i < InputStr.length(); i++) {
			Character ch=InputStr.charAt(i);
			outputMap.put(ch,(outputMap.getOrDefault(ch, 0)+1));	
		}
		return outputMap;
	}
	
	public static Map.Entry<Character,Integer> maxOccurence(Map<Character,Integer> inputMap) {
		//Map<Character,Integer> outputMap=new HashMap();
		//int maxValue= Collections.max(inputMap.values());
		int maxValue=-1;
		Character maxKey=null;
		Map.Entry<Character,Integer>  maxEntry=null;
		for (Map.Entry<Character,Integer> entry :inputMap.entrySet()) { 
			if (maxValue<entry.getValue()) {
				maxValue=entry.getValue();
				maxKey=entry.getKey();
				maxEntry=entry;
			}
		}
		return maxEntry;
		
	}
}
