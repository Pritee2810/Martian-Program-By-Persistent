package streamAndFiles;
import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;

public class FileWriteDemo {
	public static void main(String[] args) throws IOException{
		File file = new File("C:\\Users\\ThinkPad\\Desktop\\Martian\\My\\File1.txt");
		FileInputStream fis = null;
		FileOutputStream fout = null;
		try {
			fis = new FileInputStream(file);
			fout = new FileOutputStream("C:\\Users\\ThinkPad\\Desktop\\Martian\\My\\File2.txt");
			
			int content;
			while((content = fis.read()) != -1) {
				fout.write(content);
			}System.out.println("File copied successfully");
		}catch(IOException e) {
			e.printStackTrace();
		}fis.close();
		fout.close();
	}
	
}
