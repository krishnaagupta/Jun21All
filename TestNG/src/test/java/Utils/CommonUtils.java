package Utils;

import  Utils.AppConstants;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class CommonUtils {
	public static Logger log =Logger.getLogger(CommonUtils.class);

	//Readds a value from properity file
	public String getApplicationproperity(String key) throws IOException  {
		String value="";	
		Properties prop=new Properties();
		String filepath=AppConstants.USER_DIR+File.separator+AppConstants.APPLICATION_PROPERITIES;
		System.out.println(filepath);
		FileInputStream inputfile= new FileInputStream(filepath);
		try {
			prop.load(inputfile);
			value=prop.getProperty(key);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			inputfile.close();
		}
		System.out.println("value-->"+value);
		return value;

	}
}
