package Programs;

import java.util.Scanner;

//Q23. WJP to differentiate input as string, int or bool *
public class Q23CheckInput {

	public static void main(String[] args) {
	System.out.println("Enter the input");
	Scanner input=new Scanner(System.in);
	if (input.hasNextBoolean()){
		System.out.println("Input is boolean");
	}
	else if(input.hasNextInt()){
		System.out.println("Input is Integer");
		
	}
	else if(input.hasNextFloat()){
		System.out.println("Input is float");
		
	}
	else if(input.hasNextLine()){
		System.out.println("Input is string");
		
	}

	}

}
