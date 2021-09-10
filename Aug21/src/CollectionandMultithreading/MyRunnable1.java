package CollectionandMultithreading;
//WJ Program to implement thread using runnable interface.
  class MyRunnable1 implements Runnable{

	

	@Override
	public void run() {
		for (int i =0;i< 5;i++) {
			System.out.println("Thread " + Thread.currentThread().getId()+ " is running");		
		}
		}
		
}


