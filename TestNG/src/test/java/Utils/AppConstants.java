package Utils;

import java.io.File;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;

public class AppConstants {
	public static Logger log =Logger.getLogger(AppConstants.class);


	//public static final String URL_PROPERTYFILE_PATH="/Users/krishnaagupta/eclipse-workspace/repos/Jun21All/TestNG/src/test/java/TestData/application.properties";
	public static final String  APPLICATION_PROPERITIES="/src/test/java/TestData"+File.separator+"application.properties";
	public static final String USER_DIR=System.getProperty("user.dir");

}
