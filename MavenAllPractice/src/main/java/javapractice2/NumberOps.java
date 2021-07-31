package javapractice2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NumberOps {
	public static int numRev(int numb) {
		int rev=0;
		while (numb>0) {
			int num=numb%10;
			rev=rev*10+num;
			numb=numb/10;

		}
		return rev;
	}

	public static boolean numPalindrome(int numb) {
		boolean flag=false;	
		int rev=numRev(numb);
		if (rev==numb) {
			flag=true;
		}
		System.out.println(numb+"-"+rev);
		return flag;	
	}
	public static int [] Fibonacciseries(int count) {
		int n1=0,n2=1,n3,i;
		int arr[]=new int[count];
		arr[0]=0;
		arr[1]=1;
		for(i=2;i<count;i++) {
			n3=n1+n2;
			arr[i]=n3;
			n1=n2;
			n2=n3;
		}
		return arr;
	}

	/*public static int [] FibonacciRecur(int count) {
		int n1=0,n2=1,n3,i;
		int arr[]=new int[count];
		arr[0]=0;
		arr[1]=1;
		for(i=2;i<count;i++) {

		}

	}*/
	public static boolean PriimeNumbers(int numb) {
		boolean isprime=true;
		for(int i=2;i<numb;i++) {

			if (numb%i==0) {
				isprime=false;
				break;
			}
		}

		return isprime;
	}
	public static boolean armstrongnumbers(int numb) {
		int input=numb;
		int rev=0,anumb=0;
		boolean flag=false;
		while(numb>0) {
			int num=numb%10;
			anumb=anumb+(num*num*num);
			numb=numb/10;
		}
		System.out.println(anumb+"--"+input);
		if (anumb==input) {
			flag=true;
		}
		System.out.println(flag);
		return flag;	
	}

	public static ArrayList revomeDuplicate(int arr[]){
		Map <Integer,Integer>numbers= new HashMap<Integer,Integer>();
		for (int i=0;i<arr.length;i++) {
			numbers.put(arr[i], numbers.getOrDefault(numbers, 0)+1);
		}
		ArrayList<Integer> brr = new ArrayList<Integer>();
		//ArrayList brr=new ArrayList();
		for (Entry<Integer, Integer> entry :numbers.entrySet()) {
			if (entry.getValue()==1) {

				brr.add(entry.getKey());
			}
		}
		System.out.println(brr);
		return brr;
	}

	public static boolean leapyear(int year) {
		boolean isLeap=false;
		if ((year%4==0)&&(year%100!=0)){
			isLeap=true;
		}
		else if (year%400==0) {
			isLeap=true;
		}
		return isLeap;
	}

	public static int lcm(int a,int b) {
		int lcm=0;
		int temp;
		int num1=a;
		int num2=b;
		while(b!=0) {
			temp=b;
			b=a%b;
			a=temp;		
		}
		int gcd=a;
		lcm=(num1*num2)/gcd;
		return lcm;
	}

	public static int gcf(int a,int b) {
		int gcf=0;
		int lcm=0;
		int temp;
		int num1=a;
		int num2=b;
		while(b!=0) {
			temp=b;
			b=a%b;
			a=temp;		
		}
		 gcf=a;
		
		return gcf;
	}
	public static int squareroot(int numb) {
		int squareRoot=0;
		return squareRoot;
	}
}
