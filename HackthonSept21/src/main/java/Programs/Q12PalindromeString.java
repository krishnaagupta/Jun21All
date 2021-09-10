package Programs;

import java.util.Scanner;

//Q12. Write a program to check palindrome (MalayalaM) for both numbers and string? *
public class Q12PalindromeString {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner input=new Scanner(System.in);
		String inputstr= input.nextLine();
		String output=stringPalindrome(inputstr);
		if (output.equals(inputstr)) {
			System.out.println("The Strings are palindrome");
		} else {
			System.out.println("The Strings are not palindrome");
		}
	int num;
	System.out.print("Enter the number for checking for p[alindrome");
	num=input.nextInt();
		int reverseNumber =IntPalindrome(num);
		if (reverseNumber==num) {
			System.out.println("The number are palindrome");
		}else {
			System.out.println("The number are not  palindrome");
		}
			
	}
	public static String stringPalindrome(String inputstr) {
		String output="";
		for (int i=(inputstr.length()-1);i>=0;i--) {
			output=output+inputstr.charAt(i);
		}
		return  output;	
	}
	public static int IntPalindrome(int num) {
		int reversenumb=0;
		while(num>0) {
			int numr=num%10;
			reversenumb=reversenumb*10+numr;
			num=num/10;
		}
		
		return reversenumb;
		
		
	}
	
}
