package JavaPractice;

public class ThreadPractice extends Thread{
	
	int threadCount=0;
	
	@Override
	public void run(){
	       threadCount++;
	       System.out.println("MyThread running. count="+threadCount);

	    }
	
	public int getThreadCount() {
		return threadCount;
	}



	public Thread createThread() {
		Thread th=new ThreadPractice();
		return th;
	}
	
	
}
