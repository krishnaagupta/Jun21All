package CollectionandMultithreading;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		MyRunnable1 myrun1=new MyRunnable1();
		MyRunnable2 myrun2=new MyRunnable2();
		Thread t1=new Thread(myrun1);// create a thread link with runnable object as runnable does not have start
		t1.start();
		
		Thread.sleep(500);
		Thread t2=new Thread(myrun2);
		t2.start();
	}

}
