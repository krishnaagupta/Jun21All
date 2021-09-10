package JavaPrg;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//6. Reverse string with out using reverse command 
public class Stringops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the I/p");
		String inputString=input.nextLine();
		System.out.println("The input "+inputString);
		String result=stringRev(inputString);

		System.out.println("The outis "+result);
		
		String outStr=duplicatechar(inputString);
		System.out.println("TheDuplicate characters are "+outStr);
	}
	public static String stringRev(String inputString ) {
		String reverseString="";
		for (int i=inputString.length()-1;i>=0;i--) {
			reverseString=reverseString+inputString.charAt(i);
		}
		return reverseString;
	}
	public static void reverseWord(String inputString) {
		String str[]=inputString.split(" ");
		for (int i=str.length;i>0;i--) {
			System.out.println();	
		}
	}
	public static String duplicatechar(String inputString) {
		Map <Character,Integer> hash= new HashMap<>();
		String str1="";
		for (int i=0;i<inputString.length();i++) {
			char ch=inputString.charAt(i);
			hash.put(ch, hash.getOrDefault(ch, 0)+1);
		}
		//Map.Entry<Character,Integer>  maxEntry=null;
		for (Map.Entry<Character,Integer> entry :hash.entrySet()) { 
			char checkSpace = entry.getKey();
			
			if ((entry.getValue()>1 )&& !(entry.getKey().equals(" "))){
				str1=str1+" "+entry.getKey();
			}


		}
		return str1;


	}

}
