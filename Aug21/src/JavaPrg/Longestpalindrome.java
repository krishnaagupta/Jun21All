package JavaPrg;

import java.util.Scanner;

public class Longestpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the  string");
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String word[]=str.split(" ");
		int maxlength=0;
		String MaxStr="";
		for (int i=0;i<word.length;i++) {
			boolean check=isPalindrome (word[i]);
			//System.out.println(check);
			if (check == true){
				if (word[i].length()>maxlength) {
					maxlength=word[i].length();
					MaxStr=word[i];
				}
			}

		}

		System.out.println("The longest palindrome is "+MaxStr);
	}
	public static boolean  isPalindrome(String str1) {
		boolean flag=false;
		String strrev="";
		for (int i=str1.length()-1;i>=0;i--) {
			strrev=strrev+str1.charAt(i);
			
		}
		//System.out.println(strrev+str1);
		if (str1.equals(strrev)) {
			flag=true;
		}
		return flag;
	}
}
