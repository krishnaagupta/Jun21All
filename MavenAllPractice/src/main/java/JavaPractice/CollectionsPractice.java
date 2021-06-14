package JavaPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CollectionsPractice {

	public static void main(String args[]) {
		//		int  option;
		//		System.out.println("Select an option");
		//		Scanner input= new Scanner(System.in);
		//		option = input.nextInt();
		//		switch(option){
		//		case 1 :  arraylistdemo();
		//		
		//
		//
		//
		//		}
		//test1();
		arrayListIteration();
	}
	public static void arraylistdemo() {

		Scanner input =new Scanner(System.in);
		ArrayList<Integer>num=new ArrayList();
		for (int i=0;i<5;i++) {
			num.add(input.nextInt());
		}

		for (Integer number :num) {

			System.out.println("number"+number);
		}
	}

	public static String printContentOfArrayList(ArrayList<Integer> input) {

		String ret = new String();
		for (Integer number :input) {
			ret = ret + "number"+number+",";
		}

		return ret;
	}

	public static void test1() {
		ArrayList myInput=new ArrayList<Integer>();
		myInput.add(3);
		myInput.add(7);
		myInput.add(9);
		myInput.add(0);
		myInput.add(1);

		String expected = "number3,number7,number9,number0,number1,";
		String actual = printContentOfArrayList(myInput);

		if (expected.equals(actual)) {
			System.out.println("match");
		} else {
			System.out.println("no match");
		}
	}
	public static void arrayListIteration() {
		ArrayList<String> name=new ArrayList<String>();
		name.add("Anika");
		name.add("vivaan");
		name.add("kk");
		name.add("ss");
	
		Iterator<String> it= name.iterator();
		while (it.hasNext()) {
			
			System.out.println(name);
		}
	}
}
