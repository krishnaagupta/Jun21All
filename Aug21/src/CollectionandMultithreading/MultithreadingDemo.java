package CollectionandMultithreading;
/*class Hi {//
	public void show() throws InterruptedException {//normal way
		for (int i=0;i<5;i++) {
			System.out.println("hi");
			Thread.sleep(1000);
		}
	}
}
class Hello  {
	public void show() throws InterruptedException {
		for (int i=0;i<5;i++) {
			System.out.println("Hello");
			Thread.sleep(1000);
		}
	}
}


public class MultithreadingDemo {

	public static void main(String[] args) throws InterruptedException { // here main is a single thread so 5 times hellow and 5 times hi is printed.
		// TODO Auto-generated method stub
		Hi obj1=new Hi();
		Hello obj2=new Hello();
		//obj1.start();// Thread class thread has a constructor .start will call the constrtuctor and which inturn calls run
		//obj2.start();
		obj1.show();
		obj2.show();

	}

}*/
class Hi extends Thread{ // multiThreading
public void run() {
	for (int i=0;i<5;i++) {
		System.out.println("hi");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
class Hello extends Thread {
public void run() {
	for (int i=0;i<5;i++) {
		System.out.println("Hello");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}


public class MultithreadingDemo {

public static void main(String[] args) throws InterruptedException { // here main is a single thread so 5 times hellow and 5 times hi is printed.
	// TODO Auto-generated method stub
	Hi obj1=new Hi();
	Hello obj2=new Hello();
	obj1.start();// Thread class thread has a constructor .start will call the constrtuctor and which inturn calls run
	obj2.start();
	

}

}
