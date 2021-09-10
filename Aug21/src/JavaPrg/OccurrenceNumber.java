package JavaPrg;
 
/*10. Program to find occurrence of number ( Example, i/p → {1,3,23,45,4,3,23} 
o/p → 
1 → Occurred 1 times 
3 → Occurred 2 times 
23→ Occurred 2 times 
45 → Occurred 1 times 
4 → Occurred 1 times */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccurrenceNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10];
		for(int i=0;i<10;i++) {
			Scanner input=new Scanner(System.in);
			arr[i]=input.nextInt();
		}
		Map<Integer,Integer> hash1=new HashMap<Integer,Integer>();
		for(int i=0;i<10;i++) {
			hash1.put(arr[i], hash1.getOrDefault(arr[i], 0)+1);
		}
		for( Map.Entry<Integer,Integer> entry :hash1.entrySet()) {
		System.out.println( entry.getKey()	+"-> Occured  "+entry.getValue()+ " times");
		}	
	}

}
