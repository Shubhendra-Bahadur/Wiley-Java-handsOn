package fileio;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		String s1="abc";
		String s2="abc";
		s1.equals(s2);
		
		try(FileWriter fw = new FileWriter("first.txt",true)){
			
			fw.write(", I am in in file first.txtddwfd");
			System.out.println("file modified");
//			fw.close();
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
