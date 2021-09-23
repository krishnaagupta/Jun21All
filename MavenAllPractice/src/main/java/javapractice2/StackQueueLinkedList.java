package javapractice2;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

//public class StackQueueLinkedList {
	/*public static int[] stackops(int numb) {
		Stack <Integer>s1=new Stack();

		while(numb>0) {
			int num=numb%10;

			s1.push(num);
			numb=numb/10;
		}
		//System.out.println(s1.size());
		int a[]= new int [s1.size()];
		int size=s1.size();
		for (int i=0;i<size;i++) {

			a[i]=s1.pop();
			System.out.println(a[i]);
		}

		return a;
	}*/
/*
	public static int[] queueOps(int numb) {
		Queue<Integer> q1 = new PriorityQueue<>();

		while(numb>0) {
			int num=numb%10;
			q1.add(num);
			numb=numb/10;
		}
		int a[]= new int [q1.size()];
		int size=q1.size();
		for (int i=0;i<size;i++) {
			a[i]=q1.remove();
		}
		return a;
	}
	public static int[] queueOps(int numb) {
		Queue<Integer> q1 = new PriorityQueue<>();

		while(numb>0) {
			int num=numb%10;
			q1.add(num);
			numb=numb/10;
		}
		int a[]= new int [q1.size()];
		int size=q1.size();
		for (int i=0;i<size;i++) {
			a[i]=q1.remove();
		}
		return a;
	}*/
	
	/*public static int[] linklistOps(int numb) {
		LinkedList<Integer> l1 = new LinkedList<>();

		while(numb>0) {
			int num=numb%10;
			l1.add(num);
			numb=numb/10;
		}
		int a[]= new int [l1.size()];
		int size=l1.size();
		for (int i=0;i<size;i++) {
			a[i]=l1.remove();
		}
		return a;
	}*/
	
	/*
	 public class Test {
  
    public static void main(String args[])
    {
        // Creating object of the
        // class linked list
        LinkedList<String> ll
            = new LinkedList<String>();
  
        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");
  
        System.out.println(ll);
  
        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();
        ll.set(1, "For"); //set methood for changing an element
  
        System.out.println(ll);
    }
}
	 
	  
	 */
	
//}
