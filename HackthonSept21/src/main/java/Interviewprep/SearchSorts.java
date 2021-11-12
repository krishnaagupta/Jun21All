package Interviewprep;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SearchSorts {

	public static void main(String[] args) {
		int[] arr=new int [] {1,2,4,5,6};
		//boolean flag=binarSearch(arr,5);
		//		System.out.println("falg--"+flag);
		//		flag=binarSearch(arr,3);
		//		System.out.println("falg--"+flag);

		//bubbleSort(arr);
		//selectionSort(arr);
		//occurence("SHREE HARI");
		//		leapyear(300);
		//		leapyear(2020);
		//		leapyear(2021);
		//		fact(5);
		//		fact(0);
		//		int display=factrecur(5);
		//		int display1=factrecur(0);
		//		System.out.println("Res=+"+display +display1);
		//fibo(5);
		//fibo(2);
		//fibo(6);
		
		
		
//		for (int i=0;i<6;i++) {
//			System.out.println(fiborecur(i));
//		}
		
		reverseNumb(123);
		//reverseNumb(670);
	}



	public static Boolean binarSearch(int arr[],int ele) {
		boolean found=false;
		int mid,start=0,end=arr.length-1;
		mid=(start+end)/2;
		while (start<end) {
			if (ele==arr[mid]) {
				System.out.print("elemenmt found at pos "+mid);
				found =true;
				break;
			}
			else if (ele < arr[mid]) {
				end=mid-1;
			}
			else if (ele>arr[mid]) {
				start=mid+1;
			}
			mid=(start+end)/2;
		}
		return found;
	}

	public static void bubbleSort(int arr[]) {
		int temp;
		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if (arr[i]< arr[j]) {// only one line to make it reverse  sort
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}

			}
		}
		for (int i=0;i<arr.length;i++) {
			System.out.println("Sorted"+arr[i]);
		}
	}
	public static void selectionSort(int arr[])
	{
		int minindex=0;
		for (int i=0;i<arr.length-1;i++) {
			for (int j=i+1;j<arr.length-1;j++) {
				minindex=i;
				if (arr[i]>arr[j]) {
					minindex=j;
				}
				int temp=arr[i];
				arr[i]=arr[minindex];
				arr[minindex]=temp;
			}

		}
		for (int i=0;i<arr.length;i++) {
			System.out.println("Sorted"+arr[i]);
		}
	}

	public static  void occurence(String str) {
		Map<Character,Integer> map1=new HashMap();
		for (int i=0;i<str.length();i++) {
			map1.put(str.charAt(i), map1.getOrDefault(str.charAt(i), 0)+1);
		}
		System.out.println(map1);

		for (Entry<Character,Integer> entry:map1.entrySet()){
			if (entry.getKey().equals('R')) {
				System.out.println("value"+ entry.getValue());
			}

		}
	}

	public static void leapyear(int year) {
		boolean isLeap= false;
		if (year % 4==0) {
			isLeap=true;
			if (year %100==0) {
				if (year%400==0 ) {
					isLeap=true;
				}
				else {
					isLeap=false;
				}
			}

		}
		System.out.println("flas++"+isLeap)	;
	}


	public static void fact(int n) {
		int res=1;
		for(int i=1;i<=n;i++)	{
			res=res*i;
		}
		System.out.println("ans--"+res);
	}

	public static int factrecur(int n) {
		int res=1;
		if (n==0 || n==1) {
			return 1;
		}
		else {
			return (n*factrecur(n-1));
		}

	}

	public static  void fibo(int n) {

		int n1=0,n2=1,n3;
		System.out.println(n1+","+n2);
		for (int i=2;i<n;i++){
			n3= n1+n2;
			System.out.println(n3+",");
			n1=n2;
			n2=n3;
			
		}
	}
	
	public static int fiborecur(int n) {
		if (n <= 1) {
			return n;
		}else {
		return fiborecur(n-1)+fiborecur(n-2);
		}

		
		}
	public static void reverseNumb(int num) {
		int res=0;
		while (num>0) {

			int numb=num%10;
			res=res*10+numb;
			num=num/10;
		}
		System.out.println(res);
	}
			
	}




