package Programs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Q31. Read a file content and write it to a new file in reverse order.(reverse line 1-10 to line 10-1) *
public class Q31FileReadWrite {
	///Users/krishnaagupta/eclipse-workspace/repos/Jun21All/HackthonSept21"
	public static void main(String[] args) throws IOException {
		String sPath= System.getProperty("user.dir")+"/src/test/resources/Read.txt";
		System.out.println(sPath);
		FileReader fr= new FileReader(sPath);
		BufferedReader br=new BufferedReader(fr);
		String sline,str="";
		while((sline=br.readLine())!=null){
	
			str=str+sline+"\n";
		
		}
		 String strarr[]=str.split("\n");
		//file Write
		String strWrite="";
		String sPathWrite=System.getProperty("user.dir")+"/src/test/resources/fileWrite";
		FileWriter fw=new FileWriter(sPathWrite);
		BufferedWriter bw=new BufferedWriter(fw);
		for (int i=strarr.length-1;i>0;i--) {
			strWrite=strWrite+strarr[i]+"\n";

		}
		System.out.println(strWrite);
		bw.write(strWrite);
		bw.flush();
	}
}
