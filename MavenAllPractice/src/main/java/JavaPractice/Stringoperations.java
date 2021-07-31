package JavaPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.InputMap;

import org.testng.annotations.Test;

public class Stringoperations {
	public static void main(String[] args) {
		int  option;
		System.out.println("Select an option");
		Scanner input= new Scanner(System.in);
		option = input.nextInt();
		switch(option){
		case 1 :  getString();
		case 2 :  getStringArr();
		case 3 : reverserString();
		case 4 : reversewordofstring();
		case 5 : reverseeachwordofstring();
		case 6 : occurenceofletter();
		case 7 : occurenceofword();
		case 8 : PalindromeString();

		}
	}

	public static void getString () {
		String str;
		int n;
		Scanner input= new Scanner(System.in);
		System.out.println("enter the string");

		str=input.nextLine();
		System.out.println("String Entered"+str);
	}

	public static void getStringArr () {
		String arr[];
		int n;
		Scanner input= new Scanner(System.in);
		System.out.println("enter the number opf elements in string array");
		n= input.nextInt();
		arr=new String[n];
		for (int i=0;i<n;i++){
			arr[i]=input.next();
		}

		System.out.println("String Entered");
		for (int i=0;i<n;i++){
			System.out.println("Elements of string array are --"+arr[i]);
		}
	}
	public static void reverserString () {
		System.out.println("Enter the string");
		String Str,reversedString="";
		Scanner input= new Scanner(System.in);
		Str=input.nextLine();
		for (int i=Str.length()-1;i>=0;i--) {
			reversedString=reversedString+Str.charAt(i);

		}
		System.out.println("String reversed-"+reversedString);
	}
	public static void reversewordofstring () {
		System.out.println("Enter the string");
		String Str,str1[],reversedword="";
		Scanner input= new Scanner(System.in);
		Str=input.nextLine();
		str1=Str.split(" ");
		for (int i=(str1.length-1);i>=0;i--) {
			System.out.print("String output"+ str1[i]);
		}
	}

	public static void reverseeachwordofstring () {
		System.out.println("Enter the string");
		String Str,str1[],reversedword="";
		Scanner input= new Scanner(System.in);
		Str=input.nextLine();
		str1=Str.split(" ");
		for (int i=(str1.length-1);i>=0;i--) {
			for (int j=(str1[i].length()-1);j>=0;j--) {
				reversedword=reversedword+str1[i].charAt(j);

			}
			reversedword=reversedword+" ";
		}
		System.out.print("String output"+ reversedword);
	}

	public static void occurenceofletter () {
		System.out.println("Enter the string for occurrence");
		String Str;
		Scanner input= new Scanner(System.in);
		Str=input.nextLine();
		HashMap<Character ,Integer>map1=new HashMap();
		for (int i=0;i<Str.length();i++) {
			char ch=Str.charAt(i);
			map1.put(ch, map1.getOrDefault(ch, 0)+1);
		}
		System.out.println("output"+map1);
	}


	public static void occurenceofword () {
		System.out.println("Enter the string for  wordoccurrence");
		String Str ,str1[];
		Scanner input= new Scanner(System.in);
		Str=input.nextLine();
		str1=Str.split(" ");
		HashMap<String ,Integer>map1=new HashMap();
		for (int i=0;i<str1.length;i++) {

			map1.put(str1[i], map1.getOrDefault(str1[i], 0)+1);
		}
		System.out.println("output"+map1);
	}
	public static void PalindromeString () {
		System.out.println("Enter the string to check for palindrome");
		String str ,strrev="";
		boolean flag= false;
		Scanner input= new Scanner(System.in);
		str=input.nextLine();
		for (int i =(str.length()-1);i>=0;i--){
			strrev=strrev+str.charAt(i);
		}
		if (str.equals(strrev)) {
			System.out.println("palindrome");
		}
		else 
		{
			System.out.println("not a palindrome");
		}


	}
	//Q15. Given a string print the unique words of the string. 
	/*public static ArrayList UniqueWordsOfString(Map<String, Integer>inputMap){
		Map<String, Integer>result= null;
		ArrayList<String> outputArr=new ArrayList();
		for(Map.Entry<String, Integer> entry: inputMap.entrySet()) {
			if (entry.getValue()==1) {
				outputArr.add(entry.getKey().toString());
			}
		}
		return outputArr;

	}*/

	public static Set<String> uniqueWordsOfString(String inputStr){

		String [] inputArr=inputStr.split(" ");
		Set<String>uniqueOutputString =new TreeSet<String>();
		for(String input:inputArr){
			uniqueOutputString.add(input);
		}

		return uniqueOutputString;
	}

}
