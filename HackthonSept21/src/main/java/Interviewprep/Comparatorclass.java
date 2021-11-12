package Interviewprep;

import java.util.Comparator;

public class Comparatorclass implements Comparator<Student> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Student o1, Student o2) {
		
			String name =((Student)o1).getStudentname();
			String name1 =((Student)o2).getStudentname();
			int roll1=o1.getRollnum();
			int roll2=o2.getRollnum();
			if (name.compareTo(name1)==0) {
				return roll1-roll2;
			}
			else {
			return name.compareTo(name1);
			}
			
		}
	}


