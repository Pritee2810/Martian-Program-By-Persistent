package streamAndFiles;
import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) throws IOException{
		File file = new File("C:\\Users\\ThinkPad\\eclipse-workspace\\Martian_Java\\src\\string\\StringDemo.java");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			System.out.println("Total file size to read (in bytes):"+ fis.available());
			
			int content;
			while((content = fis.read()) != -1) {
				System.out.print((char) content);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis != null)
					fis.close();
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		}

	}

}
