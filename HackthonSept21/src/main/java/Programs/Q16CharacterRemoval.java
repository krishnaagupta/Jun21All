package Programs;

import java.util.Scanner;

//Q16. Write a method that will remove given character from the String? *
public class Q16CharacterRemoval {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner input=new Scanner(System.in);
		String inputstr= input.nextLine();
		System.out.println("Enter the character to be removed");
		char ch=input.next().charAt(0);
		String output="";
		for (int i=0;i<inputstr.length();i++) {
			if (inputstr.charAt(i)!=ch) {
				output=output+inputstr.charAt(i);
			}
		}
		System.out.println("OutPut string with"+ ch +"removed ");
		System.out.println(output);
		
	}

}
