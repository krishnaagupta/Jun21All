package JavaPrg;

import java.util.Scanner;

// write a program to put zero in end
public class ZeroAtEnd {

	public static void main(String[] args) {
		String number ;
		Scanner input =new Scanner (System.in);
		number=input.next();
		String str1[]=number.split("");
		//String 
		for (int i=0;i<str1.length;i++) {
			System.out.println(str1[i]);
			if (str1[i].equals("0")&& (i+1)<str1.length) {
			
			String temp=str1[i];
				str1[i]=str1[i+1];
				str1[i+1]=temp;
				System.out.println("exchange");
			}
		}
		for (int i=0;i<str1.length;i++) {
			System.out.println("result is"+str1[i]);
		}
	}
	
}
