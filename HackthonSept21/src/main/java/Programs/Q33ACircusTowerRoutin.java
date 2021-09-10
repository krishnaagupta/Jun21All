package Programs;
//Q33. A circus is designing a tower routine consisting of 
/*people standing atop one another’s shoulders. For practical and 
aesthetic reasons, each person must be both shorter and lighter
than the person below him or her. Given the heights and weights of 
each person in the circus, write a method to compute the largest possible 
number of people in such a tower. EXAMPLE: Input (ht, wt): (65, 100) (70, 150) 
(56, 90) (75, 190) (60, 95) (68, 110) Output: The longest tower is length 6 and 
includes from top to bottom: (56, 90) (60,95) (65,100) (68,110) (70,150) (75,190) */

public class Q33ACircusTowerRoutin {
	private int height,weight;

	public Q33ACircusTowerRoutin(int height,int weight) {
		this.height=height;
		this.weight=weight;
	}
	public  String toString() {
		return "[Height=" + this.height +" , "+ " weight=" + this.weight + "]";
	}


	public static void main(String[] args) {
		Q33ACircusTowerRoutin c1= new Q33ACircusTowerRoutin(65, 100);
		Q33ACircusTowerRoutin c2= new Q33ACircusTowerRoutin(70, 150);
		Q33ACircusTowerRoutin c3= new Q33ACircusTowerRoutin(56, 90);
		Q33ACircusTowerRoutin c4= new Q33ACircusTowerRoutin(75, 190);
		Q33ACircusTowerRoutin c5= new Q33ACircusTowerRoutin(60, 95);
		Q33ACircusTowerRoutin c6= new Q33ACircusTowerRoutin(68, 110);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);

	}

}
