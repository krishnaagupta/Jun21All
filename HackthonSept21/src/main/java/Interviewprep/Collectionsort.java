package Interviewprep;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.DelayQueue;



//Question-2: Write code to sort the list of strings using Java collection?
public class Collectionsort {

	public static void main(String[] args) {
		arraylistopps();
		//ArraylistToArray();

		//TraverseHashSet();
		//arrayToList();
		//TraverseHashMAp();
		//convertlisttoset();
		//convertlisttomap();
		//convertmaptoList();
		//Linkedlistops();
		//queuwops();
		queuwopsComparator();
	}
	public static  void arraylistopps() {
		ArrayList<String> arr = new ArrayList<String>();
		//		for (int i=0;i<10;i++) {
		//			arr.add(i);
		//
		//		}
		//		Iterator it= arr.listIterator();
		//		while (it.hasNext()) {
		//			System.out.println(" value" + it.next());
		//		}
		//		Iterator it1= arr.listIterator(7);//iterator  does not allow it
		//		System.out.println("value at 7th pos"+ it1.next());
		arr.add("ll");
		arr.add("pp");
		arr.add("bb");
		arr.add("aa");
		ListIterator it3= arr.listIterator();
		while (it3.hasPrevious()) {
			System.out.println(" value" + it3.previous());
		}
		Collections.sort(arr);
		System.out.println(arr);
		arr.remove("aa");
		System.out.println(arr);
		//	for (int i=0;i<10;i++) {
		//		System.out.println(" value"+arr);
		////
		//	}// create an empty array list 
		//	    ArrayList<String> color_list = new ArrayList<String>();
		//
		//	    // use add() method to add values in the list
		//	    color_list.add("White");
		//	    color_list.add("Black");
		//		color_list.add("Red");
		//	   
		//	   System.out.println("List of the colors :" + color_list);
		//	   
		//	   // using listIterator() method get a ListIterator object
		//	    ListIterator itrr = color_list.listIterator();
		//		   
		//	   //Use hasNext() and next() methods to iterate through the elements in forward direction.
		//	     System.out.println("Iterating in forward direction");
		//	     while(itrr.hasNext())
		//	      System.out.println(itrr.next());
		//	 
		//	 
		//	   // Use hasPrevious() and previous() methods to iterate through the elements in backward direction.
		//	      System.out.println("Iterating in backward direction");
		//		   
		//	    while(itrr.hasPrevious()) {
		//	      System.out.println(itrr.previous());
		//	     }



	}
	public static void ArraylistToArray() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i=0;i<10;i++) {
			arr.add(i);

		}
		Object[] arr1=arr.toArray();

		arr1= arr.toArray();
		for (int i=0;i<10;i++) {
			System.out.println("arraylistToarray"+arr1[i]);

		}

	}
	public static void TraverseHashSet() {
		HashSet set1=new HashSet();
		for (int i=0;i<20;i++) {
			set1.add(i);
		}
		//			Iterator it= set1.iterator();
		//			while (it.hasNext()) {
		//				System.out.println("entry"+ it.next());
		//			}
		//			for entry:
		//				System.out.println("entry--"+entry);
		//			
		//		}

		for (Object a:set1)	 {
			System.out.println(a);
			System.out.println("hsgsh"+set1.contains(1));
		}
	}
	public static void arrayToList() {
		int arr[]=new int [] {1,2,3,4,5};
		ArrayList<Integer>arra1=new ArrayList(Arrays.asList(arr));
		System.out.println(arra1);
	}

	public static void TraverseHashMAp() {
		HashMap<Character,Integer> map1=new HashMap();
		String str="hello how are you";
		for (int i=0;i<str.length();i++) {
			map1.put(str.charAt(i),map1.getOrDefault(str.charAt(i), 0)+1);
		}
		for (Entry<Character,Integer>entry:map1.entrySet()) {
			System.out.print(entry);
		}
	}

	public static void convertlisttoset() {

		ArrayList arr=new ArrayList();
		for(int i=0;i<5;i++) {
			arr.add(1);
			arr.add(1);
			arr.add(1);
			arr.add(4);
			arr.add(5);
		}

		Set<Integer>set1=new HashSet(arr);
		System.out.println(set1);

		ArrayList<Integer>arrnew=new ArrayList(set1);
		System.out.println(arrnew);
	}

	public static void convertlisttomap() {
		ArrayList<String> arr=new ArrayList<String>();
		for(int i=0;i<5;i++) {
			arr.add("anu");
			arr.add("tiku");
			arr.add("jksh");
			arr.add("tiku");
			arr.add("uu");
		}

		HashMap<String,Integer>map1=new HashMap();
		for (String str: arr) {
			map1.put(str, str.length());
		}

		System.out.println("map"+map1);
	}


	public static void convertmaptoList() {
		HashMap<String,Integer>map1=new HashMap();
		map1.put("jsd", 3);
		map1.put("dzczx", 5);
		map1.put("df",2);
		map1.put("3", 1);



		ArrayList<String> arr=new ArrayList<String>();
		for (Entry<String,Integer> entry:map1.entrySet()) {
			arr.add(entry.getKey());
		}

		System.out.println("list"+arr);
	}

	public static void Linkedlistops () {
		LinkedList<Integer> li=new LinkedList();
		li.add(3);
		li.add(4);
		li.add(7);
		li.add(2);
		li.add(8);

		li.add(3, 1);
		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);
		li.remove(3);
		System.out.println(li);
	}

	public static void queuwops() {
		PriorityQueue<Integer>q1=new PriorityQueue<Integer>();// here the pool removes the objects depending on natural ordering
		q1.add(1);
		q1.add(2);
		q1.add(4);
		q1.add(5);
		q1.add(6);
		q1.add(1);
		
		System.out.println("---------------------------------------");
		while (!q1.isEmpty()){
			System.out.println(q1.poll());
		}
		Queue<Integer>q2=new LinkedList<Integer>();
		q2.add(1);
		q2.add(2);
		q2.add(4);
		q2.add(5);
		q2.add(6);
		q2.add(1);
		//q2.remove(3);
		System.out.println("---------------------------------------");
		while (!q2.isEmpty()){
			System.out.println(q2.poll());
		}
		Queue<Integer>q3=new ArrayDeque<Integer>();
		q3.add(1);
		q3.add(2);
		q3.add(4);
		q3.add(5);
		q3.add(6);
		q3.add(1);
		
		System.out.println("---------------------------------------");
		while (!q3.isEmpty()){
			System.out.println(q3.poll());
		}

	}	

	//Comparator anonymous class implementation
	//An anonymous class in Java is a class not given a name and is both declared 
	//and instantiated in a single statement. You should consider using an anonymous class whenever you 
	//need to create a class that will be instantiated only once.
	public static Comparator<Integer> idComparator = new Comparator<Integer>(){
		
		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o2-o1; // sorts desending
		}	
	};
	public static void queuwopsComparator() {
		PriorityQueue<Integer>q1=new PriorityQueue<Integer>(5,idComparator );// here a priority queue with initial capacity 5, and mycomparator())
		q1.add(1);
		q1.add(2);
		q1.add(4);
		q1.add(5);
		q1.add(6);
		q1.add(1);
	     
        // Overriding compare()method of Comparator 
                    // for descending order of cgpa
        
		System.out.println("---------------------------------------");
		while (!q1.isEmpty()){
			System.out.println("priopity --"+q1.poll());
		}
	}
}



