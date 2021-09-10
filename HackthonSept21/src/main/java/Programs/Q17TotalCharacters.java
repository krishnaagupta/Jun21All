package Programs;

import java.util.Scanner;

//Q17. WJP to find total number of integers, uppercase and lowercase 
//character in the give string *
public class Q17TotalCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		Scanner input=new Scanner(System.in);
		String inputstr= input.nextLine();
		int counti=0,countu=0,countl=0;
		for (int i=0;i<inputstr.length();i++) {
			char ch =inputstr.charAt(i);
			if (ch>='0' && ch <='9') {
				counti++;
			}
			else if (ch>='a' && ch <='z') {
				countl++;
			}
			else if (ch>='A' && ch <='Z') {
				countu++;
			}
			
		}
		int total=counti+countu+countl;
		System.out.println("The total number of uppercase ,lowercase and integer is->"+total);
	}

}
