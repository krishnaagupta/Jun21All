package FileRead;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextreadwiteUsingBufferredReadWriter {

	public static void main(String[] args) {
		String sPath =System.getProperty("user.dir")+"/Files/Test1.txt";
		System.out.println(sPath);
		readFile(sPath);
		writeFile(sPath);
	}
	public static void readFile(String sPath) {
		try {
			FileReader oFilReader =new FileReader(sPath);
			BufferedReader oBufferredReader=new BufferedReader (oFilReader);

			String sLine;
			while ((sLine=oBufferredReader.readLine())!=null){
				System.out.println(sLine);
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	
	public static void writeFile(String sPath)  {
		//belwo code only using a file writer not used a buffered writer
		FileWriter oFile=null;
		BufferedWriter oFw;
		
		try {
			 oFile= new FileWriter(sPath,true);
			oFw= new BufferedWriter(oFile);
			//String sline =" hariom";
			System.out.println("Enter a data for file");
			
			System.out.println(sline);
			//oFw.write(sline);	
			oFile.write(sline);
		
			oFile.close();
		} 
		catch (FileNotFoundException e) {

			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
				/*try {
					oFw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				try {
					oFile.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		

		}
}
