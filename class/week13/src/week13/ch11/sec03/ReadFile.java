package week13.ch11.sec03;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
	
	public static void ReadFileContents() throws IOException
	{
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("file.txt");
		} catch(IOException e) {
			System.out.println(e.toString());
		} finally {
			fis.close();
		}
	}
	public static void ReadFileContent() throws IOException
	{
		try(FileInputStream fis = new FileInputStream("file.txt")) {
			//..........
		} catch(IOException e) {
			System.out.println(e.toString());
		}
	}
	public static void ReadFileContents3() throws IOException
	{
		try(FileInputStream fis_1 = new FileInputStream("file.txt");
			FileInputStream fis_2 = new FileInputStream("file.txt");
		){
		} catch(IOException e) {
			System.out.println(e.toString());
		} 
	}



	public static void main(String[] args) throws IOException{
		ReadFileContents();
	}

}
