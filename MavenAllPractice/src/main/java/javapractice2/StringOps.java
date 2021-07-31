package javapractice2;

import java.util.HashMap;
import java.util.Map;

public class StringOps {

	public static String stringRev(String input) {
		String revString="";
		for (int i=input.length()-1;i>=0;i--) {
			revString=revString+input.charAt(i);
		}
		return revString;
		
	}
	
	public static String stringRevWord(String input1) {
		String revString="",strarr[];
		strarr=	input1.split(" ");
		
		for (int i=strarr.length-1;i>=0;i--) {
			revString=revString+strarr[i];
			if (i!=0) {
				revString=revString+" ";	
			}
		};
	return	revString; 
	}
	public static  boolean palindrome(String str) {
		boolean check=false;
		String revStr="";
		revStr=stringRev(str);
		System.out.println(revStr);
		if (str.equals(revStr)) {
			check=true;
		}
		return check;
		
	}
	public static boolean isAnagram(String str1,String str2) {
		boolean anagram=false;
		Map<Character,Integer>map1=new HashMap<Character,Integer>();
		if (str1.length()==str2.length()) {
			for (int i=0;i<str1.length();i++) {
				Character ch=str1.charAt(i);
				map1.put(ch,map1.getOrDefault(ch, 0)+1);
				
			}
			System.out.println(map1);
		}
		Map<Character,Integer>map2=new HashMap<Character,Integer>();
		if (str1.length()==str2.length()) {
			for (int i=0;i<str2.length();i++) {
				Character ch=str2.charAt(i);
				map2.put(ch,map2.getOrDefault(ch, 0)+1);
				
			}
			System.out.println(map2);
		}
		if (map1.equals(map2)) {
			anagram=true;
		}
		return anagram;
	}
}
