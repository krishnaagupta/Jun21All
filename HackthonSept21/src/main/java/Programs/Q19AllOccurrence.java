package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Q19. WJP to display number of occurrence of all character *
public class Q19AllOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		Scanner input=new Scanner(System.in);
		String inputstr= input.nextLine();
	
		Map<Character,Integer> map1=new HashMap<Character,Integer>();

		for (int i=0;i<inputstr.length();i++) {
			char ch =inputstr.charAt(i);
			map1.put(ch, map1.getOrDefault(ch, 0)+1);
			
		}
		System.out.println("Output");
		System.out.println(map1);
	}

}
