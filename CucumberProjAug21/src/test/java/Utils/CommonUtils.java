package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

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
}
