package JavaPractice;

import java.io.IOException;

public class StudentInfo implements Comparable<StudentInfo> {
	private String name;
	private int age;

	public StudentInfo(String name,int age) throws IOException {
		setName(name);
		if (setAge(age)==false) {
			throw new IOException();
		}
	}



	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	private boolean setAge(int age) {
		if (age >7 && age < 20) {
			this.age = age;
			return true;
		}
		else {
			return false;
		}
	
	}
	
	public int compare(StudentInfo other) {
		
		if (other==null) {
			return -1;
		}
		
		StudentInfo otherStudent =  (StudentInfo)other;
		if (this.getName().equals(otherStudent.getName()) && this.getAge()==otherStudent.getAge())  {
			return 0; 
		}
		
		if (this.getName().equals(otherStudent.getName())){
		
			if (this.getAge()>otherStudent.getAge()) {
				return 1;
			} else {
				return -1;
			}
		}
		
		return this.getName().compareTo(otherStudent.getName());
	}

	@Override
	public int hashCode() {
		return getName().hashCode() + getAge();
	}
	
	@Override
	public boolean equals(Object other) {
		
		if (this==other) {
			return true;
		}
		
		if (!(other instanceof StudentInfo)) {
			return false;
		}
		
		StudentInfo otherStudent =  (StudentInfo)other;
		if (this.getName().equals(otherStudent.getName()) && this.getAge()==otherStudent.getAge())  {
			return true; 
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return new String ("Name: "+this.getName()+", Age: "+this.getAge());
	}
}
