package JavaPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ThreadPracticeTest {

	@Test
	public void test1() {
		ThreadPractice main=new ThreadPractice();
		for(int i=0;i<100;i++) {

			Thread th= main.createThread();
			th.start();
		}
		Assert.assertEquals(main.getThreadCount(), 100);
		
	}
}
