package JavaPrg;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Convert digits to string ( i/p → 1253 → One Two five three) 

public class DigitsToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map1=new HashMap<Integer,String>();

		map1.put(1, "one");
		
		map1.put(2,"Two");
		map1.put(3,"Three");
		map1.put(4,"Four");
		map1.put(5,"Five");
		map1.put(6,"Six");
		map1.put(7,"Seven");
		map1.put(8,"Eight");
		map1.put(9,"Nine");
		map1.put(0,"Zero");
		
		System.out.println("Enter the number");
		Scanner input=new Scanner(System.in);
		String num=input.nextLine();
		String Str[]=num.split("");
		String output="";
		
		for (int i=0;i<Str.length;i++ ) {
			int n= Integer.parseInt(Str[i]);
			System.out.println(n);
			output=output+map1.get(n);
		}
		
		
		
		
		
		
		
		
		/*for( Map.Entry<Integer, String> entry:map1.entrySet()) {
			if (entry.getKey().equals(Str[i])) {
				output=output+entry.getValue();
			}
			i++;
		}*/
	
		System.out.println("output-->"+output+" ");
	}

	private static int Integer(String string) {
		// TODO Auto-generated method stub
		return 0;
	}


	
}
