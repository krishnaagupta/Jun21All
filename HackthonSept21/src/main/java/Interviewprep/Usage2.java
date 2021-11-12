package Interviewprep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Usage2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Student>a1=new ArrayList();
		a1.add(new Student("k",1));
		a1.add(new Student("a",2));
		a1.add(new Student("b",3));
		a1.add(new Student("c",4));
		a1.add(new Student("a",5));
		// u need to create a object of comparator to sort over rise the compare function 
		//function. create a class comparatorclass and override the compare methodd.
		// the class is created please see
		// create a object of comparatorclass and pass it
		
		Comparator<Student>com=new Comparatorclass();
		Collections.sort(a1,com);
		
		System.out.println(a1);
	}

//	@Override
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		String name =((Student)o1).getStudentname();
//		String name1 =((Student)o2).getStudentname();
//		int rollnum=((Student)o1).getRollnum();
//		int rollnum1=((Student)o2).getRollnum();
//		if (name.compareTo(name1) ==0) {
//			return rollnum-rollnum1;
//		}
//		else {
//			return name.compareTo(name1);
//		}
//	
//	
//	}






	
}
