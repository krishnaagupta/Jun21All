package JavaPrg;

import java.util.Scanner;

public class ImplementingOperationWithAddition {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int numb1 =input.nextInt();
		int numb2=input.nextInt();
		int a=numb1;
		int b=numb2;

		int result=sub(a,b);
		System.out.println("substraction result "+a+b+"="+ result);
		int x=numb1;
		int y=numb2;

		int result1=mul(x,y);
		System.out.println("multiplication result "+x+y+"="+ result1);

		int c=numb1;
		int d=numb2;
		int result2=div(c,d);

		System.out.println("dicision result "+b+c+"="+ result2);
	}


	public static int sub(int a,int b) {
		int result= a+(-1)*b;
		return result ;
	}

	public static int mul(int a,int b) {
		int result=0;
		for(int i=0;i<b;i++) {
			result=result+a;
		}

		return  (result);
	}

	public static int div(int a ,int b) {
		int res=a,i=0;
		while (res!=0) {
			res= res+(-1)*(b);
			i++;
		}

		return i;		
	}
}
