package JavaPractive2Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import javapractice2.Factorialrecursive;
public class FactRecurTest {

@Test
public  static void Test1() {
	int n=5;
	int rest=Factorialrecursive.fact(n);
	Assert.assertEquals(120, 120);

}


	
}
