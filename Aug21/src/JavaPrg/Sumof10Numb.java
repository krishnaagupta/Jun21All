package JavaPrg;
//4.WJP to calculate the sum of first 10 natural number using while loop
public class Sumof10Numb {
	public static void main(String[] args) {
		int sum=0;
		int i=1;
		while(i<=10) {
			sum=sum+i;
			i++;
		}
		System.out.println("The sum of first 10 numbers is "+sum);
	}
}
