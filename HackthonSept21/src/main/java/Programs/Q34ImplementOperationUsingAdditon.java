package Programs;

import java.util.Scanner;

//Q34. Write a method to implement *, - , / operations. You should use only the + operator *
public class Q34ImplementOperationUsingAdditon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two numbers");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int res=0;
		for (int i=0;i<b;i++){
			res=res+a;

		}
		System.out.println("a*b->"+res);
		int sub=-1;
		int subres=0;
		subres=a+negative(b);
		System.out.println("a-b->"+subres);

		int divres =a;
		if(a>=b) {	
			for(int i=0;i<b;i++) {
				divres=divres+negative(i);

			}
			System.out.println("a/b->"+divres);

		}

		else
		{
			System.out.println("first number shd be greater thatn the second");
		}
	}
	
	private static int negative(int b) {
		// TODO Auto-generated method stub
		return -b;
	}
}

