package JavaPrg;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//onvert roman number to integer number ( Ex: Roman V → 5, Roman XI ➔ 11) 
public class RomanToDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character,Integer> map1=new HashMap<Character,Integer>();

	
		map1.put('I', 1);
		map1. put('V', 5);
		map1. put('X', 10);
		map1. put('L', 50);
		map1.put('C', 100);
		map1.put('D', 500);
		map1. put('M', 1000);
		int sum=0,res=0;

		System.out.println("Enter the String");
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		for (int i=0;i<str.length();i++) {
			char ch=str.charAt(i);

			if (i!=str.length()-1 && map1.get(str.charAt(i+1))>map1.get(str.charAt(i))) {

				res=(map1.get(str.charAt(i+1))-map1.get(str.charAt(i)));
				sum=sum+res;
				i++;
			}
			else {
				sum=sum+map1.get(str.charAt(i));
			}

		}
		System.out.println("output"+sum);
	}

}
