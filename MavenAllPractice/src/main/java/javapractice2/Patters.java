package javapractice2;
//print all patterns
public class Patters {
	// triangle
	public static void rightangleTriangle(int rows) {
		for (int i=1;i<=rows;i++) {

			for(int j=0;j<i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println("");
		}
	}
	public static void triangle(int rows) {
		for (int i=0;i<rows;i++) {
			for (int k=0;k<rows-i;k++) {
				System.out.print(" ");
			}
			for (int  j=0;j<i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println("");
		}

	}
	public static void diamond(int rows) {
		for (int i=0;i<rows;i++) {
			for (int k=0;k<rows-i;k++) {
				System.out.print(" ");
			}
			for (int  j=0;j<i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println("");
		}
		//only outer loopchange
		for (int i=rows;i>0;i--) {
			for (int k=0;k<rows-i;k++) {
				System.out.print(" ");
			}
			for (int  j=0;j<i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println("");
		}

	}

	public static void main (String args[]) {
		//rightangleTriangle (5);
		//triangle(5);
		diamond(5);
	}


}
