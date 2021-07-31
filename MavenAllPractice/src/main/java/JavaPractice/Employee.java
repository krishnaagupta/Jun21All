package JavaPractice;
import java.util.*;
import java.io.*;

public class Employee implements Comparable {
	private String firstName;
	private String lastName;
	private float sal;
	private int id;
	private String[] boss ;
	
	public Employee() {
	boss=new String[10];	
	}
	public Employee(int id,String firstName,String lastName,float sal,String boss[]) {
	//public Employee(int id,String firstName,String lastName,float sal) {	
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.sal=sal;
		this.boss=boss;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

			
	
	
	public String toString() {
		return "Employee Details->ID="+id+"FirstName="+firstName+"LastName="+lastName+"Salara="+sal+" Boss="+Arrays.toString(boss);
	}
	public int compareTo(Object o) {
		return this.getFirstName().compareTo(((Employee) o).getFirstName());
	}

}

