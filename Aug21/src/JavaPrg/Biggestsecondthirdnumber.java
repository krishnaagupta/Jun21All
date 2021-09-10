package JavaPrg;

import java.util.Scanner;
//Write Java program to find first big, second big and third biggest number ( Take user input, use scanner function) 
// one way is to do sort and display else do a nested if else as below
public class Biggestsecondthirdnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner input =new Scanner(System.in);
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		if ((a> b) &&(a> c) ){
			System.out.println("Biggest"+ a);
			if (b>c) {
				System.out.println("Second largest is"+ b);	
				System.out.println("Third largest is"+ c);
			}
			else {
				System.out.println("Second largest is"+ c);	
				System.out.println("Third largest is"+b);
			}
		}
// 2nd combination
		if ((b> a) &&(b> c) ){
			System.out.println("Biggest"+ b);
			if (a>c) {
				System.out.println("Second largest is"+ a);	
				System.out.println("Third largest is"+ c);
			}
			else {
				System.out.println("Second largest is"+ c);	
				System.out.println("Third largest is"+a);
			}
		}
	//third combination
		if ((c> a) &&(c> b) ){
			System.out.println("Biggest"+ c);
			if (a>b) {
				System.out.println("Second largest is"+ a);	
				System.out.println("Third largest is"+ b);
			}
			else {
				System.out.println("Second largest is"+ b);	
				System.out.println("Third largest is"+a);
			}
		}
	
	
	}

}
