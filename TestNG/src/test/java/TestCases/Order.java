package TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;


import org.testng.annotations.Test;

public class Order {

	@BeforeClass
    public void beforeclass()
    {
        System.out.println("beforeclass");
    }
	

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("beforeTest");
    }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("\nbeforeMethod");
    }


    @Test
    public void firstTest()
    {
    	abc();
        System.out.println("firstTest");
    }

    @Test
    public void secondTest()
    {
    	firstTest();
        System.out.println("secondTest");
    }

    @Test
    public void thirdTest()
    {
        System.out.println("thirdTest");
    }
    
    public void abc() {
        System.out.println("abc");
    }
	
}
