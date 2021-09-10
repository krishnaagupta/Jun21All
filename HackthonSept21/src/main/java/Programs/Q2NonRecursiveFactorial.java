package Programs;

import java.util.Scanner;

//Q2. write a program to find factorial (Non Recursive) *
public class Q2NonRecursiveFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number for which you want the factorial");
		Scanner input=new Scanner (System.in);
		int num=input.nextInt();
		int res=1;
		if (num==0) {
			System.out.println("The Factorial of 0  is-->1");
		}
		else if (num>1){
		for (int i=1;i<=num;i++) {
			res=res*i;
		}
		System.out.println("The Factorial of "+num+"is-->"+res);
		}
	}
}
