package Programs;

import java.util.Scanner;

//Q21. WJP to convert string to int *
public class Q21Stringtoint {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();

		int i = Integer.parseInt(str);
		System.out.println("output"+str); 
	}
}


