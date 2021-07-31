package JavaPractice;

public class Circle {
private double radius;
private String color;

public Circle() {
	radius=1.0;
	color="red";
	
}
public Circle(double radius) {
	radius=this.radius;
}
public void setRadius(double radius) {
	if (radius >1&& radius <10) {
		this.radius = radius;
	}
	else {
		this.radius =1.0;
		System.out.println("Radius less than one or greater than 10");
	}
}
public void setColor(String color) {
	//set the color only it is blue,green,yellow,red;
	if (color=="yellow"|| color=="blue"||color=="green") {
		this.color=color;
	}
	else {
		this.color="red";
	}
}
public double getRadius() {
	return radius;
}
public String getColor() {
	return color;
}

public double getArea(double r) {
  double area= Math.PI*r*r;
  return area;
}

public double getcircumference(double r) {
	  double circumference= Math.PI*2*r;
	  return circumference;
	}
 public String  toString() {
	return "Circle details radius= "+radius+"color="+color;
	 
 }
 
}
