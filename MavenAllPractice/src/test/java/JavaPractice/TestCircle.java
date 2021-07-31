package JavaPractice;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1= new Circle();
		Circle c2= new Circle(2.0);
		//System.out.printf(c1.toString());
		//System.out.printf(c2.toString());
		c1.setColor("pink");
		//System.out.printf(c1.toString());
		c1.setRadius(5);
		//System.out.printf(c1.toString());
		;
		System.out.print(c1.getArea(c1.getRadius()));
	}

}
