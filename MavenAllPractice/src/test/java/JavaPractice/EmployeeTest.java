package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1=new Employee(1,"kk","g",100,new String[]{"gopi","kk"});
		Employee e2=new Employee(2,"ss","d",200,new String[]{"gopi"});
		Employee e3=new Employee(3,"ll","v",1000,new String[]{"bb"});
		Employee e4=new Employee(4,"AA","b",1200,new String[]{"xx"});
		Employee e5=new Employee(5,"vv","n",4000,new String[]{"zz"});
		ArrayList emp=new ArrayList();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);

		Collections.sort(emp);// natural order

		System.out.println(emp);

		Collections.sort(emp,Collections.reverseOrder()); //reverse order

		System.out.println(emp);
		//using comparator 
		Collections.sort(
				emp, 
				new Comparator<Employee>() {
					@Override
					public int compare(Employee p1, Employee p2) {
						return (int) (p1.getSal() - p2.getSal());
					}
				}
				);
		System.out.println(emp);	

		Collections.sort(
				emp, 
				new Comparator<Employee>() {
					@Override
					public int compare(Employee p1, Employee p2) {
						return p1.getLastName().compareTo(p2.getLastName());
					}
				}
				);
		System.out.println(emp);
	}
}
