package FileRead;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class ProperrtFileReadWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String sPath ="/Users/krishnaagupta/eclipse-workspace/repos/Jun21All/FileReadWrite/Propertiesfile/property.properties";
		System.out.println(sPath);
		readPropertyfile( sPath);
		writePropertyfile(sPath);
	}
 public static void readPropertyfile(String sPath) throws IOException {
	 Properties property= new Properties();
	
	 FileReader file=new FileReader(sPath);// canuse a filereader or fileinputstream 
	 property.load(file);
	 System.out.print(property.get("Url"));
	 System.out.print(property.get("username"));
	 System.out.print(property.get("pwd"));
 }
 
 
 public static void writePropertyfile(String sPath) throws IOException {
	 Properties property= new Properties();
	
	 FileWriter file=new FileWriter(sPath);
	// property.l
	
	 property.setProperty("Url","www.gmail.com");// canuse a fileWriter or fileoutputstream 
	 property.setProperty("username","ll");
	 property.store(file, "just updated");
	
 }
}
