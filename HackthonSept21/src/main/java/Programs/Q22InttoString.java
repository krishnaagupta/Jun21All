package Programs;

import java.util.Scanner;

//Q22. WJP to convert int to string 
public class Q22InttoString {

	public static void main(String[] args) {
		System.out.println("Enter the int");
		Scanner input=new Scanner(System.in);
		int i =input.nextInt();
		String s=String.valueOf(i);  
		System.out.println("output "+ i);//300 
	}

}
