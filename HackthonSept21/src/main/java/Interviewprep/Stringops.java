package Interviewprep;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Stringops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter there the op");
		int op =input.nextInt();

		switch (op)
		{
		case 1:// simple string rev
		
			stringreverse("krishnaa k");
			
			break;
		case 2:
			anagram("ope","she");
			anagram("one","eno");
			break;
		case 3:
			Stringwordreverse("hi how are you");
			break;
		case 4:
			palindrome("racecar");
			palindrome("open");
			break;
		case 5:
			uniqueWordinString(" hi hi hello how is is");
			break;
		case 6:	
			occurence ("hi hello is");
			break;
		case 7:
			charcount ("908 Hi ++/ kK");
			break;
		case 8:
			// Write Java code to get rid of multiple spaces from a string?
			getRidOfMultipleSpace("hi how are you");
			break;
		case 9:
		//Write a Java program to find the longest substring from a given 
		//string which doesn’t contain any duplicate characters?
			longestSubString("abcdaefghi");
		case 10:
			asciiValue('a');
			asciiValue('K');
			break;
		
		default:
			System.out.println("option not selected");
		}
	}

	public static void stringreverse(String str1) {
		String str2="";
		for (int i =str1.length()-1; i >= 0;i--) {
			str2=str2+str1.charAt(i);
		}

		System.out.println("rev-->"+str2);

	}

	public static void Stringwordreverse(String str4) {
		String str2="";
		String arr[]=str4.split("");

		for (int i =arr.length-1; i > 0;i--) {
			str2=str2+arr[i];
		}
		System.out.println("rev-->"+str2);
		
	}
	public  static void anagram(String str1,String str2) {
		Map<Character,Integer> map1= new HashMap();
		for (int i=0;i<str1.length();i++) {
			map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0)+1);
			System.out.println(map1);
		}
		Map<Character,Integer> map2= new HashMap();
		for (int i=0;i<str2.length();i++) {
			map2.put(str2.charAt(i), map2.getOrDefault(str2.charAt(i), 0)+1);
			System.out.println(map2);
		}
		if (map1.equals(map2)) {
			
			System.out.println("Anagram");
		}
		else {
			System.out.println(" not a Anagram");
			
		}


	}
	public static void palindrome(String str1) {
		String str2="";
		for (int i =str1.length()-1; i >= 0;i--) {
			str2=str2+str1.charAt(i);
		}
		if (str1.equals(str2)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println(" not a palinedrome");
		}
	}

	public static void uniqueWordinString(String str1) {
		String str2="";
		String arr[]=str1.split(" ");
		Map<String,Integer> map1= new HashMap();
		for (int i=0;i<arr.length;i++) {
			map1.put(arr[i], map1.getOrDefault(arr[i], 0)+1);
		}
		System.out.println(map1);
		//traverse the map 
		for (Map.Entry<String,Integer> entry: map1.entrySet())
		{
			if (entry.getValue() ==1 && entry.getKey()!= " ") {
				str2=str2+" "+entry.getKey();
			}
		}
		System.out.println("ans->"+str2);

	}
	public static void occurence(String str1) {
		Map<Character,Integer> map1= new HashMap();
		for (int i=0;i<str1.length();i++) {
			map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0)+1);
		}
		System.out.println(map1);
	}

	public static void charcount(String str1) {
		int counti=0,countu=0,countl=0,counts=0,countsp=0;
		for (int i=0;i<str1.length();i++) {
			char ch=str1.charAt(i);
			if (ch>='0' && ch<='9') {
				counti++;
			}
			else if (ch>='a'&& ch<'z'){
				countl++;
			}
			else if (ch>='A'&& ch<'Z'){
				countu++;
			}
			else if (ch==' '){
				counts++;
			}
			else {
				countsp++;
			}
		}
		System.out.println(str1);
		System.out.println("res> "+ counti+" "+countu+" "+countl+" "+counts+" "+countsp);
	}
	
	public static void getRidOfMultipleSpace(String str) {
		String str2= str.replaceAll("\\s", "");
		System.out.println(str2);
		
	}
	
	public static void longestSubString(String str1) {
		
		Map<Character,Integer>map1= new LinkedHashMap();
		for (int i=0;i<str1.length();i++) {
			char ch =str1.charAt(i);
			System.out.print(ch);
			if (!map1.containsKey(ch)){
				map1.put(ch, i);
			}
		}
		
		System.out.print(map1);
	}	
		
	public static void asciiValue(char ch) {
		
		System.out.print("Eneter a char to know thet acsii value");
		int num= (int)ch;
		System.out.print("The value of ascii value of character is  "+num);
	}
	}
	
	




