package Interviewprep;



public class Student implements Comparable {
	private String studentname;
	private int rollnum;
	public String getStudentname() {
		return studentname;
	}
	public  Student(String studentname,int rollnum ) {
		this.studentname=studentname;
		this.rollnum=rollnum;
	}
	public  Student() {
		this.studentname="kk";
		this.rollnum=1;
	}
	
	
	public void setStudentname(String studentname) {
		if (studentname.length()<5){
		this.studentname = studentname;}
		else {
			System.out.println("The name length should be less than 5");
		}
	}
	public int getRollnum() {
		
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		if (rollnum<10) {
		this.rollnum = rollnum;
		}
		else {
			System.out.println("the roll num shd be less than 10");
		}
	}
	public String toString() {
		return "Strudent[" + studentname + rollnum +"]";
	}
	//@Override// use comparable interface and override comparat TO in base class if class has the power to sort 
	/*public int compareTo(Object o) {
		
		    String compareName=((Student)o).getStudentname();
		    int regn=((Student)o).getRollnum();
		    /* For Ascending order*/
//		    if( this.studentname.compareTo(compareName)==0){
//		    	return this.rollnum-regn;
//		    } else {
//		    	return this.studentname.compareTo(compareName);
//		    }		
		//}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	}
	


