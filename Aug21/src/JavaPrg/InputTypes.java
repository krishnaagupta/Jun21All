package JavaPrg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class InputTypes {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.out.println("Enter a text");
Scanner input=new Scanner(System.in);
String job=input.nextLine();
System.out.println("Scanner o/p"+job);

//2nd way
/*System.out.println("Enter a text");
//String str1="";
 String str1= System.console().readLine();
System.out.println("Console op"+str1);*/

//3rd way
BufferedReader rdr= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a text");
String str2=rdr.readLine();
System.out.println("Enter int");

BufferedReader rdr1= new BufferedReader(new InputStreamReader(System.in));
int i= rdr1.read();
System.out.println("Bugffer reader op"+str2);
System.out.println("Bugffer reader op for int"+i);

	}

}
