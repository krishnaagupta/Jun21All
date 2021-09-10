package JavaPrg;
// Write a program to display fibonaaci series n=15
//write a java program to display factors  n=5
public class Resurssionfibonaciandfactor {

	public static void main(String[] args) {

		System.out.print("The Fibbonacci  recursive series of 15 numbers is");
		for (int i=0;i<15;i++) {
			System.out.print(fibonaccirecursive (i)+",");
		}

		fibonacci (15);// non recursive
		factor(5);// non recursive

		int recurfact=recursivefactor(5);
		System.out.print("The factors of  first 5 numbers is "+ recurfact);


	}
	//0,1,1,2,3,5,8


	public static void fibonacci(int n) {
		int n1=0,n2=1,n3;
		System.out.println(n1+","+n2);
		for(int i=2;i<n;i++) {

			n3=n1+n2;
			System.out.print(","+n3);
			n1=n2;
			n2=n3;

		}
	}
	public static int fibonaccirecursive(int n) {
		if (n==0) {
			return 0;
		}
		if ((n==1)||(n==2)) {
			return 1;
		}

		else {
			return fibonaccirecursive(n-2)+fibonaccirecursive(n-1);
		}
	}

	public static void factor (int n) { 
		int result=1;
		for (int i =0;i<n;i++) {		
			result=result*(n-i);
		}
		System.out.println("Non recursive fact "+result);
	}

	public static int recursivefactor(int n) {
		int res=1;
		if (n<1) {
			return 1;
		}
		else {
			return n*recursivefactor(n-1);


		}
	}

}







