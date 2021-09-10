package JavaPrg;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//4.Input string= “ABCAABCAEBE” which character is duplicated less/leasr number of times.
public class LeastDuplicatedChar {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	String str1=input.nextLine();
	Map<Character,Integer> hash1= new HashMap();
	for (int i=0;i<str1.length();i++) {
		char ch=str1.charAt(i);
		hash1.put(ch, hash1.getOrDefault(ch, 0)+1);
	}
	String str2="";
	int least=Collections.min(hash1.values());////--one way is to use collection 
		System.out.println("Hash"+hash1);	
		for( Map.Entry<Character,Integer> entry :hash1.entrySet()) {
			if (entry.getValue()==least){
				System.out.println("output"+entry.getKey());
			}
		}
	/*int least =100;// second way is to use the usual traversal
	for( Map.Entry<Character,Integer> entry :hash1.entrySet()) {
		if (entry.getValue()<least){
			least=entry.getValue();
		}
	}
	for( Map.Entry<Character,Integer> entry :hash1.entrySet()) {
		if (entry.getValue()==least){
			System.out.println("output"+entry.getKey());
		}
	}	*/
	
	}

}
