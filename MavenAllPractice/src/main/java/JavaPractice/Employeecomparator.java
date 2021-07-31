package JavaPractice;

import java.util.Comparator;

public class Employeecomparator implements Comparator {

	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if (o1.getSal()>o2.getSal()) {
			return 1;
		}else {
			return -1;
		}
			
	}

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
