package CollectionandMultithreading;
//https://www.geeksforgeeks.org/multithreading-in-java/

	 class MyRunnable2 implements Runnable{

			

			@Override
			public void run() {
				for (int i=0;i<5;i++) {
				System.out.println("hello "  );
				}
			}
		}

