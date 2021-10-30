package Interviewprep;

import java.util.Scanner;

public class Integerops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter there the op");
		int op =input.nextInt();
		switch (op){

		case 1:
			reverseNumb(400);
			break;
		case 2:
			//prime(400);
			prime(13);
			break;
		case 3://Write a Java program to find out the first two max values from an array?
			twomaxofarray();
			break;
		case 4:
			swapwithout3variable(9,0);
			break;
		case 5:
		isLeap(2021);
		isLeap(300);
		isLeap(2000);
		break;
		case 6:
		sumofNaturalNumber(6);
		break;
		case 7:
			generateMultiplication(4);
			generateMultiplication(6);
			break;
		case 8:
			boolean flag=isArmstrong(153);
			boolean flag1 =isArmstrong(213);
			System.out.println("out put"+flag+flag1);
			break;
		case 9:
			armstrongRage(100,1000);
			
		}		
	}
	public static void reverseNumb(int num) {
		int res=0;
		while(num>0) {
			int numb=num%10;
			System.out.println("numb"+numb);
			res= res*10+numb;
			System.out.println("res"+res);
			num=num/10;
			System.out.println("num"+num);
		}
		System.out.println("revernum"+res);
	}


	public static void prime (int num) {
		boolean flag =false;

		for (int i = 2; i <= num / 2; ++i) {
			// condition for nonprime number
			if (num % i == 0) {
				flag = true;
				break;
			}
		}

		if (!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}


	public static void twomaxofarray () {
		int arr[]=new int[] {2,1,4,7,9,0};
		for (int i=0;i<arr.length-1;i++) {
			for (int j=i+1;j<arr.length;j++) {
				int maxindex=i;
				if (arr[i]<arr[j]) {
					maxindex=j;
				}
				int temp=arr[i];
				arr[i]=arr[maxindex];
				arr[maxindex]=temp;
			}


		}
		for ( int i=0;i<2;i++) {
			System.out.println(arr[i]);
		}
	}

	public static void swapwithout3variable(int a,int b) {

		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a,b"+a+" "+b);
	}
	
	public static void isLeap(int year) {
		boolean isLeap=false;
		if (year %4==0) {// didvisibel by 4
			if (year %100==0) {// chk if it is a centuerary year then check%400 
				if (year%400==0) {
					isLeap=true;}
				else {
					isLeap=false;}
				}
			else 
				isLeap=true;
			}
			else 
			{
				isLeap=false;
			}
			
		if (isLeap==true) {
			System.out.println("leap year");
		}
		else {
			System.out.println("not");
		}

	}
	public static void sumofNaturalNumber(int n) {
		int sum =0;
		for (int i=0;i< n;i++) {
			sum=sum+i;
		}
		System.out.println("sum of natutal number"+n+"-"+sum);
	}
	public static void generateMultiplication(int n) {
		for (int i=1;i<=10;i++) {
			System.out.println("multiplication"+n+"*"+i+"---"+n*i );
		}
	}
	//An Armstrong number is a 3 digit number for which the sum of cube of its digits is equal to the number itself. 
	public static  Boolean  isArmstrong(int num) {
		boolean isarmstrong=false;
		int originalnum=num;
		int res=0,sum=0;
		while (num>0) {
			
			int numb=num%10;
			res=res*10+numb;
			sum=sum+(numb*numb*numb);
			num=num/10;
			
		}

	if (originalnum==sum) {
	
		isarmstrong=true;
	}
	else {
		
		isarmstrong=false;
	}
	return isarmstrong;
	}
	
	
	public static void armstrongRage(int num, int num1) {
	for (int i=num;i<=num1;i++) {
		boolean flag=isArmstrong(i);
		if (flag==true) {
			System.out.println("armstrong"+ i);
		}
	}
	}
	
	public static void primefactorisation(int n) {// factors of a number
		
		
	}
}
