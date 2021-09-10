package Programs;

import java.util.Scanner;

//Q14. Given a string print the reverse of the words string.(Input: Java Code Output: Code Java) *
public class Q14StringWordReverse {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner input=new Scanner(System.in);
		String inputstr= input.nextLine();
String arr[]=inputstr.split(" ");
System.out.println("output");
for (int i=arr.length-1;i>=0;i--) {
	System.out.print(arr[i]+" ");
}
	}

}
