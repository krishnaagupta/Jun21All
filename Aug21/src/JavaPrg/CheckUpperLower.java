package JavaPrg;

import java.util.Scanner;

//3.WJP to find total number of integers, uppercase and lowercase character in the give string.
public class CheckUpperLower {

	public static void main(String[] args) {
		System.out.println("Enter I/p");
		Scanner input=new Scanner(System.in);
		String str1=input.nextLine();
		System.out.println("output"+str1);
		int countl=0,countu=0,counti=0;
		
		for (int i=0;i<str1.length();i++) {
			char ch=str1.charAt(i);
			if (ch>='a'&& ch<='z') {
				countl++;
			}
			else if (ch>='A'&& ch<='Z') {
				countu++;
			}
			else if (ch>='0'&& ch<='9') {
				counti++;
			}
		}
		System.out.println("The count of upper case letter is "+countu+"lower case count is"+countl+"integer count "+counti);
		System.out.println("total"+(countu+counti+countl));
	}
}
