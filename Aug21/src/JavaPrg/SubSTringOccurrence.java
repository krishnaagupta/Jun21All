package JavaPrg;

import java.util.Scanner;
//Given two strings, first string is a sentence and the second string is a character. You need to write a function
//to print number of characters in between the occurrences of second-string excluding spaces. 
//String1 = “I love java programming” String2 =”o”
public class SubSTringOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the sentence and the character");

		Scanner input=new Scanner (System.in);
		String str1=input.nextLine();
		int startindex=0,endindex=0;
		boolean startflag=false;
		char ch=input.next(".").charAt(0);
		for (int i=0;i<str1.length();i++) {
			if (str1.charAt(i)==ch&& startflag==false) {
				startindex=i;
				startflag=true;
			}
			else if (str1.charAt(i)==ch&& startflag==true) {
				endindex=i;
				
			} 


		}
		String str3=str1.substring(startindex+1,endindex);
		
		str3.replaceAll("\s", "");
		System.out.println(str3);
	}
}