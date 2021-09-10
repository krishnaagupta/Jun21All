package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Q18. WJP to display duplicate character in string *
public class Q18Duplicatechar {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner input=new Scanner (System.in);
		String inputstr=input.nextLine();
		

		
		Map<Character,Integer>map1=new HashMap<Character,Integer>();
		for (int i=0;i<inputstr.length();i++) {
			char ch=inputstr.charAt(i);
			map1.put(ch, map1.getOrDefault(ch, 0)+1);
		}
		String outputstr="";
		for (Map.Entry<Character,Integer> entry : map1.entrySet())
            if (entry.getValue()>1) {
            	outputstr=outputstr+","+entry.getKey();
    }
	System.out.println("Duplicate character in string are ->"+outputstr);
	}
	}

