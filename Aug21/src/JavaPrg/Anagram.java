package JavaPrg;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//7.Write a Java program to check whether two strings are anagram or not?
public class Anagram {

	public static void main(String[] args) {
		System.out.println("Enter the two words for checking");
		Scanner input=new Scanner(System.in);
		String str1=input.next();
		String str2=input.next();
		Map<Character,Integer> hash1=new HashMap();
		Map<Character,Integer> hash2=new HashMap();
		for (int i=0;i<str1.length();i++ ) {
			char ch=str1.charAt(i);
			hash1.put(ch, hash1.getOrDefault(ch, 0)+1);

		}

		for (int j=0;j<str2.length();j++ ) {
			char ch1=str2.charAt(j);
			hash2.put(ch1, hash2.getOrDefault(ch1, 0)+1);
		}
		if (hash1.equals(hash2)) {
			System.out.println("The strings are anagram");
		}
		else {
			System.out.println("The strings are  not anagram");
		}

	}

}
