package package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamMethodsExamples {
	
	public static void readMethod() throws IOException {
		System.out.println("File Path : " + System.getProperty("user.dir")+"/InputFiles/readme_file.txt");
		File file = new File(System.getProperty("user.dir")+"/InputFiles/readme_file.txt");
		
		FileInputStream fis = new FileInputStream(file);
		System.out.println(fis.read());
		System.out.println((char)fis.read());
		fis.close();
	}

}
