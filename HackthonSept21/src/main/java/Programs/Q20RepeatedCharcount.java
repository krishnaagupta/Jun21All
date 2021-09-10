package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Q20. WJP to find total number of repeated integers, uppercase and 
//lowercase character in the give string *
public class Q20RepeatedCharcount {

	public static void main(String[] args) {
		System.out.println("enter the string"); 
		Scanner input=new Scanner(System.in);
		String strinput=input.nextLine();
		Map<Character,Integer> map1=new HashMap<Character,Integer>();
		for (int i=0;i<strinput.length();i++) {
			char ch=strinput.charAt(i);
			if ((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z')||(ch>='0'&& ch<='9')) {
				map1.put(ch, map1.getOrDefault(ch, 0)+1);
			}
			
		}
		System.out.println("The Map is--" +map1);
		int total=0;
		for (Map.Entry<Character,Integer> entry : map1.entrySet()) {
			if (entry.getValue()>1) {
				total=total+1;
			}
		}
	System.out.println(" The total number of repeated integers, uppercase and lowercase character in the give string -->" + total);
	}

}
