package JavaPrg;

import java.util.Scanner;

//1.Program to remove duplicates from a string input= “abcabcabc” output = “abc”
public class DuplicatesStringRemoval {

	public static void main(String[] args) {
		System.out.println("Enter the String ");
		Scanner input=new Scanner(System.in);
		String outputStr ="";
		String str1=input.nextLine();
		for(int i=0;i<str1.length();i++) {
			char ch =str1.charAt(i);
			String temp=Character.toString(str1.charAt(i));//-->Use this function as contains only takes string so concerting it to string
			if (!outputStr.contains(temp))
				outputStr=outputStr+ch;
		}
		System.out.println("The output is--"+ outputStr);	
	}
}


