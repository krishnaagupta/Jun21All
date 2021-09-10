package JavaPrg;

public class Programming {
	private String text;
	public Programming() {
		text="I love programming languages";
	}
	public Programming(String text) {
		this.text=text;
	}	
	public String toString() {
		return "programming:"+this.text;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programming p1=new Programming();
		Programming p2=new Programming("Java");
		Programming p3=new Programming("C++");
		System.out.println("o/p"+p1);
		System.out.println("o/p"+p2);
		System.out.println("o/p"+p3);
	}

}
