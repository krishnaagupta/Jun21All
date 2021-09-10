package FileRead;
/*Java FileWriter and FileReader classes are used to write and read data from text files (they are Character Stream classes). It is recommended
 *  not to use the FileInputStream and FileOutputStream classes if you have to read and write any textual information as these
 *   are Byte stream classes.
 *   
 *    Filereader and FileWriter can be used to write and read tpo a file. they can be used together  with bufferred reader and bufferred writer  also
 *    i think buffered readder and writer can read from standaer input/op to .. need to check 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestFileReadWrite {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		String sPath =System.getProperty("user.dir")+"/Files/Test1.txt";
		System.out.println(sPath);

		System.out.print("Enter what to do! r for read,w for write");
		Scanner input=new Scanner(System.in);
		char ch= input.next().charAt(0);			
		switch (ch){
		case 'r':	
			readFile(sPath);
			break;
		case 'w':
			writeFile(sPath);
			break;
		}
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
		//BufferedWriter oFw=null;
		
		try {
			 oFile= new FileWriter(sPath,true);
			//oFw= new BufferedWriter(oFile);
			String sline =" hariom";
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
