package CollectionandMultithreading;



public class MyThread extends Thread {

@Override
public  void run() {
	for (int i=0;i<10;i++) {
			System.out.println("Thread"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	System.out.println("Thread 1 is finished");
}
}
