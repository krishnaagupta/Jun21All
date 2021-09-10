package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Q15. Given a string print the unique words of the string. *
public class Q15UniqueWordOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the string");
Scanner input=new Scanner(System.in);
String inputstr=input.nextLine();
String [] str=inputstr.split (" ");
Map<String,Integer> map1=new HashMap<String,Integer>();

for (int i=0;i<str.length;i++) {
	map1.put(str[i], map1.getOrDefault(str[i], 0)+1);
	
}
System.out.println("Output");
System.out.println(map1);
System.out.println("unique words are");
for (Map.Entry<String,Integer> entry : map1.entrySet())
   if (entry.getValue()==1) {
	   System.out.println(entry.getKey());
}

	}

}
