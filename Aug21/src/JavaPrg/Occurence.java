package JavaPrg;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Occurence {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string");
		String inputString=input.nextLine();
		System.out.println("The input "+inputString);
		HashMap<Character,Integer> hash1=new HashMap<Character,Integer>();
		hash1=occurence (inputString);
		System.out.println("The Occurent is "+hash1);
	}
	public static HashMap<Character,Integer> occurence(String inputStr){
		HashMap<Character,Integer> hash2=new HashMap<Character,Integer>();
		for (int i=0;i<inputStr.length();i++) {
			char ch=inputStr.charAt(i);
			hash2.put(ch, hash2.getOrDefault(ch, 0)+1);
		}


		return hash2;	
	}
}
