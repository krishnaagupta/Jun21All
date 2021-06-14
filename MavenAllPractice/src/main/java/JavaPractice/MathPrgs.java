package JavaPractice;

import java.util.Scanner;

public class MathPrgs {
	public static void main(String args[]) {
		int  option;
		System.out.println("Select an option");
		Scanner input= new Scanner(System.in);
		option = input.nextInt();
		switch(option){
		case 1 :  factorial(5);
		//case 2 :recursivefact(5);
		}
	}
	public static void factorial (int n) {
		int fact=1;
		if (n==0 ) {
			fact=1;
			System.out.println("result"+ fact);
		}
		else {
			for (int i=0;i<5;i++) {
				fact=fact*(n-i);
			}
			}
		System.out.println("result"+ fact);
	}


}
