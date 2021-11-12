package Interviewprep;

import java.util.ArrayList;
import java.util.Collections;

public class Usage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student ();
		Student s2=new Student ("p",2);
		Student s3=new Student ("p",3);
		Student s4=new Student ("z",4);
		Student s5=new Student("a",5);
		System.out.println("object data"+s1+s2+s3);
		ArrayList<Student>a1=new ArrayList();
		//a1.add(new Student("b",1)); can be done
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		a1.add(s5);
	Collections.sort(a1);
	System.out.println(a1);
	}

	

}
