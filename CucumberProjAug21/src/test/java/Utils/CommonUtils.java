package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;

import com.aventstack.extentreports.Status;



public class CommonUtils {
//	public static final String APPLICATION_PROPERTIES = "/src/test/java/TestData"+File.separator+"application.properties";
//	public static final String USER_DIR = System.getProperty("user.dir");
	public String getApplicationProperty(String key) throws IOException {
		
		Properties properties = new Properties();
		String filePath = AppConstants.USER_DIR+File.separator+AppConstants.APPLICATION_PROPERTIES;
		System.out.println("filepath"+filePath);
		FileInputStream inputfile = new FileInputStream(filePath);
		String value ="";
		System.out.println("key we got ->"+key);
		try {
			properties.load(inputfile);
			value = properties.getProperty(key);
			System.out.println("value we got " +value);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			inputfile.close();
		}
		
		
		return value;
		
	}
	
	public static void myassertequal(String str1,String str2, String display1,String display2) {
		if (str1.equals(str2)) {
			//ExtentTestManager.getTest().log(Status.INFO, display1);
			//log.info(display1);
			System.out.println("pass");
		}
		else {
			//ExtentTestManager.getTest().log(Status.FAIL, display2);
			//log.error(display2);
			System.out.println("faile");

		}
		Assert.assertEquals(str1, str2);
		
	}	
	
	public static void myassertcontains(String str1,String str2, String display1,String display2) {
		if (str1.contains(str2)) {
			//ExtentTestManager.getTest().log(Status.INFO, display1);
			//log.info(display1);
			System.out.println("pass");
		}
		else {
			//ExtentTestManager.getTest().log(Status.FAIL, display2);
			//log.error(display2);
			System.out.println("faile");

		}
		Assert.assertTrue(str1.contains(str2) );
		
	}	
	
}
