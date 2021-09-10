package FileRead;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//WJP to Write Multiple lines into a File and also make it in the new line.
public class MultiplelinesReadandWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String sPath=System.getProperty("user.dir")+"/Files/Test1.txt";
		writeMultipleLines(sPath);	
		//writeMultipleLinesReverse(sPath);
		//writeMulyipleLinesFromUserInput(sPath);
	}
	public static void writeMultipleLines(String sPath) throws IOException {
		FileWriter fw=new FileWriter(sPath,true);
		BufferedWriter bW= new BufferedWriter(fw);
		String str1= " hi !!how are you. Iam fine .The weather is good.The Sky is blue.";
		String str[]=str1.split("\\.");
		//System.out.println("hii");
		/*for (int i =0;i<str.length;i++) {
			System.out.println("ka"+str[i]);
		}*/
		for (int i=0;i<str.length;i++) {
			
			fw.write(str[i]);// use either a file writer or buffer writer 
			fw.write("\n");
			//bW.write(str[i]);// use either a file writer or buffer writer .below two commented lines work fine in case we uncomment and want to use only the buffered writer
			//bW.newLine();
			}
		bW.close();	
		fw.close();
		}
	
	public static void writeMultipleLinesReverse(String sPath) throws IOException {
		FileWriter fw=new FileWriter(sPath,true);
		BufferedWriter bW= new BufferedWriter(fw);
		String str1= " hi !!how are you. Iam fine .The weather is good.The Sky is blue.";
		String str[]=str1.split("\\.");
		//System.out.println("hii");
		
		for (int i=str.length-1;i>=0;i--) {
			//System.out.println("ka"+str[i]);
			fw.write(str[i]);// use either a file writer or buffer writer 
			fw.write("\n");
			//bW.write(str[i]);// use either a file writer or buffer writer .below two commented lines work fine in case we uncomment and want to use only the buffered writer
			//bW.newLine();
			}
		bW.close();	
		fw.close();
		}

	
	}
	

