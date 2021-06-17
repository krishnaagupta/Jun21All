package JavaPractice;

import java.util.Scanner;

public class MathPrgs {
	public static void main(String args[]) {
		int  option;
		//System.out.println("Select an option");
		//Scanner input= new Scanner(System.in);
		//option = input.nextInt();
		//switch(option){
		//case 1 :  factorial(5);
		//case 2 :factrecursive(5);
		int fact=factrecursive(5);
		System.out.println("fact="+ fact);
		//}
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
	
	public static int factrecursive (int n) {
		int fact=1;
		if (n==0) {
			fact=1;	
		}
		else if(n>0) {
			fact=n*(factrecursive(n-1));
		}
	return fact;
	}

}
