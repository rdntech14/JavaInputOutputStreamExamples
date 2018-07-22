package package1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReadFile {

	
public static void readFileAsBytesAndConvertBackToText() throws Exception {
		
		System.out.println("File Path : " + System.getProperty("user.dir")+"/InputFiles/readme_file.txt");
		File file = new File(System.getProperty("user.dir")+"/InputFiles/readme_file.txt");
		
		if(!file.exists()) {
			System.out.println("File does not exist");
			throw new Exception();
		}
		
		FileInputStream fis = new FileInputStream(file);
		byte[] fileContent = new byte[(int)file.length()];
		fis.read(fileContent);
		
		System.out.println(" **** decoding byte array into text");
		String s = new String(fileContent); // String class has a constructor which takes byte[] and decode into String using system charaset
		System.out.println(s);
		
		System.out.println(" **** This is encoded text in byte array");
		System.out.println(Arrays.toString(fileContent)); // Will print wired numbers
		
		fis.close();
		
	}

	public static void readFileUsingInputStreamReader() throws Exception {
		
		System.out.println("File Path : " + System.getProperty("user.dir")+"/InputFiles/readme_file.txt");
		File file = new File(System.getProperty("user.dir")+"/InputFiles/readme_file.txt");
		
		if(!file.exists()) {
			System.out.println("File does not exist");
			throw new Exception();
		}
		
		FileInputStream fis = new FileInputStream(file);
//		InputStreamReader isr = new InputStreamReader(fis);   // using default charaset
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); // using provided charaset
		BufferedReader br = new BufferedReader(isr);
		
		String s;
		while( (s = br.readLine())!=null) {
			System.out.println(s);
		}
		
		br.close();
		fis.close();
		
	}
	
	
	public static void readFileUsingFileReader() throws Exception {
		
		System.out.println("File Path : " + System.getProperty("user.dir")+"/InputFiles/readme_file.txt");
		File file = new File(System.getProperty("user.dir")+"/InputFiles/readme_file.txt");
		
		if(!file.exists()) {
			System.out.println("File does not exist");
			throw new Exception();
		}
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String s;
		StringBuilder sb = new StringBuilder();
		
		while((s=br.readLine())!=null) {
			System.out.println(s);
			sb.append(s);
		}
		
		System.out.println(sb);
		
		br.close();
		fr.close();
	}

	
}
