package JavaPractice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StudentInfoTest {

/*
	@Test 
	public void testStudentInfo() {
		testHelper("Vivaan",6);	
	}
	
	@Test 
	public void testStudentInfo1() {
		testHelper("Vivaan",8);
	}*/
	
/*	public void testHelper(String name, int age) {
		StudentInfo s1=null;
		try {
			s1=new StudentInfo(name, age); 	 
		}
		catch (Exception e) {
			System.out.println("object cannot be created");
		}
		Assert.assertNotNull(s1);
		Assert.assertEquals(s1.getAge(), age);
		Assert.assertEquals(s1.getName(), name);
		System.out.println("Student="+s1);
	}
	
	@Test 
	public void testStudentCollection() throws IOException {
		ArrayList<StudentInfo>StudentArr=new ArrayList();
		StudentArr.add(new StudentInfo("abc",8));
		StudentArr.add(new StudentInfo("jack",9));
		StudentArr.add(new StudentInfo("sun",11));
		StudentArr.add(new StudentInfo("moon",12));
		
		Assert.assertEquals(StudentArr.size(), 4);
		
		Iterator<StudentInfo>it=StudentArr.iterator();
		while(it.hasNext()) {
			System.out.println("Student details= "+ it.next());
		}
	}
	
	@Test 
	public void testStudentUsingHash() throws IOException {
		Map<StudentInfo, Integer>studentHash=new HashMap();
		studentHash.put(new StudentInfo("abc",8),1);
		studentHash.put(new StudentInfo("abc",8),2);
		studentHash.put(new StudentInfo("sun",11),3);
		studentHash.put(new StudentInfo("moon",12),4);
		
		Assert.assertEquals(studentHash.size(), 3);
		
		//Iterator<StudentInfo>it=studentHash.iterator();
		//while(it.hasNext()) {
		//	System.out.println("Student details= "+ it.next());
		//}
		for(StudentInfo s :studentHash.keySet()) {
			System.out.println("Student details= "+ s);
		}
		//Collections.so
	}
	
	@Test 
	public void testStudentUsingSet() throws IOException {
		Set<StudentInfo>studentSet=new TreeSet();
		studentSet.add(new StudentInfo("abc",8));
		studentSet.add(new StudentInfo("xyz",10));
		studentSet.add(new StudentInfo("tyu",9));
		studentSet.add(new StudentInfo("abc",8));
		
		Assert.assertEquals(studentSet.size(), 3);
		
		//Iterator<StudentInfo>it=studentHash.iterator();
		//while(it.hasNext()) {
		//	System.out.println("Student details= "+ it.next());
		//}
		for(StudentInfo s :studentSet) {
			System.out.println("Student details= "+ s);
		}
	}*/

}
