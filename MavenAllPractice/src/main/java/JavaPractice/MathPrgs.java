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

	public static boolean boolChk(boolean flagA,boolean flagB,boolean flagC) {
		boolean check =false;
		if (flagA== true && flagB==true) {
			check=true;	
		}
		else if (flagB== true && flagC==true) {
			check=true;
		}
		else if (flagC== true && flagA==true) {
			check=true;
		}
		return check;
	}

	public static boolean palindromeNumber (int numb) {
		boolean PalindromeFlag= false;
		int numb1=numb;
		int reverse=0,i;
		while(numb!=0) {
			i= numb%10;
			reverse=reverse*10+i;
			numb=numb/10;
		}
		
		if (reverse==numb1) {
			PalindromeFlag= true;
			
		}else {
			PalindromeFlag=false;
			
		}
		return PalindromeFlag;

	}

	//WJP to find total number of integers, uppercase and lowercase character in the give string
	public static int totalNumber(String inputStr) {
		int total=0,countI=0,countU=0,countL=0;
		
		for(int i=0;i < inputStr.length() ;i++) {
			char ch=inputStr.charAt(i);
			if (ch >='a' && ch <='a'){
				countL++;	
			}
			else if(ch >='A' && ch  <= 'Z'){
				countU++;
			}
			else if(ch >='0' && ch <= '9'){
				countI++;
			}
		}
		
		total=countL+countU+countI;	
		System.out.println("total1="+countL+"-"+countU+"-"+countI);
		return total;	
	}
	
	
}	
