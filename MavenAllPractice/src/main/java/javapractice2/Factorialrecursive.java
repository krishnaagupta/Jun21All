package javapractice2;

public class Factorialrecursive {
	public static  int fact(int n) {
		int res=1;

		if (n == 0)
			return 1;
		else
			return(n * fact(n-1));

	}
}
