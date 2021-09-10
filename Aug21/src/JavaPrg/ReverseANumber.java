package JavaPrg;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner input=new Scanner(System.in);
		int n;
		n=input.nextInt();
		int reverse =0;
		while(n>0) {
			int numb=n%10;
			reverse=reverse*10+numb;
			n=n/10;
		}
		System.out.println("Reverser number"+reverse);
	}

}
