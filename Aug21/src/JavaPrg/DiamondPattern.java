package JavaPrg;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number of the rows");
		Scanner input= new Scanner(System.in);
		int n= input.nextInt();
		for(int r=0;r<n;r++) {
			for(int s=0;s<n-r;s++) {
				System.out.print(" ");
			}

			for(int i=0 ; i<r;i++) {
				System.out.print("*"+" ");

			}
			System.out.println("");
		}
		
		for(int r=n;r>0;r--) {
			for(int s=0;s<n-r;s++) {
				System.out.print(" ");
			}

			for(int i=0 ; i<r;i++) {
				System.out.print("*"+" ");

			}
			System.out.println("");
		}
	}
}
/*for (int i=0;i<rows;i++) {
	for (int k=0;k<rows-i;k++) {
		System.out.print(" ");
	}
	for (int  j=0;j<i;j++) {
		System.out.print("*"+" ");
	}
	System.out.println("");
}*/
