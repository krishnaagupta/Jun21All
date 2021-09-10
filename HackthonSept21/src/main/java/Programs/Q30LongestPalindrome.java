package Programs;

import java.util.Scanner;

//Q30. Write a function to find out longest palindrome in a given string? *
public class Q30LongestPalindrome {

	public static void main(String[] args) {
		int max=0,len=0; 
		System.out.println("enter the string"); 
		Scanner input=new Scanner(System.in);
		String strinput=input.nextLine();
		String str[]=strinput.split(" ");
		String palindrome="";
		boolean flag= false;
		for (int i=0;i<str.length;i++) {
			 flag=isPalindrome(str[i]);
			 
			 if (flag ==true )	{
				len=str[i].length();
			}
			if (len>max) {
				max=len;
				palindrome=str[i];
			}
		}
		System.out.println("The longest palindrome is  "+palindrome);
	}
	public static boolean isPalindrome(String str) {
		boolean flag=false;
		String revstr="";
		for (int i =str.length()-1;i>=0;i--) {
			revstr=revstr+str.charAt(i);
		}
		
		if (str.equals(revstr)){
			flag=true;
		
		}
		return flag;
	}

}
