package JavaPrg;

public class Student {
 private String name;
 
 public Student(String name) {
	 this.name=name;
}
public  Student() {
	this.name ="unknown";
 }

 public String toString()
{
	return "Student name = "+this.name;
	 }
}
