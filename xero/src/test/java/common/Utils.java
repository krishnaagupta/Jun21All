package common;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;	
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Base.Login;



//@Listeners(Listeners.class)
public class Utils extends Login {

	
	//public static ExtentHtmlReporter htmlReporter=null;
	//public static ExtentTest test=null;
	//private String sBrowserName;
	
	
	public static void initilizeReports() {
		
		sReportTime=new SimpleDateFormat("yyyymmddhhmm").format(new Date());
		extent=new ExtentReports();
		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/reports"+sReportTime+".html");
		extent.attachReporter(htmlReporter);
		
		//reports= new ExtentReports(reportFolder+ new SimpleDateFormat("'YYMMDD'.'html'").format(new Date()));
		//htmlReporter=System.getProperty("user.dir")+"/reports";
		//reports= new ExtentReports();
		//String sReportTime=new SimpleDateFormat("yyyymmddhhmm").format(new Date());
		//extent=new ExtentReports();
		//htmlReporter=new ExtentHtmlReporter(AppConstants.EXTENT_HTML_REPORT_PATH+"//"+sReportTime+".html");
		//reports.attachReporter(reportFolder);
	}
		
	public static  String getScreenShot() throws IOException {
	Date currentdate=new Date();
	String screenShotFileName=currentdate.toString();
	File screenShotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//String destinationPath = System.getProperty("user.dir")+"/HtmlReports/"+currentdate + ".PNG";
	String destinationPath="/Users/krishnaagupta/eclipse-workspace/XeroAutomation/Screenshots/test.jpg";
	FileUtils.copyFile(screenShotFile, new File(destinationPath));
	return destinationPath;
	}
}
