package Programs;

import java.util.Scanner;

//Q13. Given a string print the reverse of the string.(Input: Java Code Output: edoC avaJ) *
public class Q13Stringreverse {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner input=new Scanner(System.in);
		String inputstr= input.nextLine();
		String output="";
		for (int i=inputstr.length()-1;i>=0;i--) {
			output=output+inputstr.charAt(i);

		}
		System.out.println("The String reverse is ->"+output );
	}

}
