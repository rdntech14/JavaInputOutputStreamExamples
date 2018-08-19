package package1;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Main {

	public static void main(String[] args) throws Exception  {
		
		
//		readMethod();
		readByteArrayMethod();
//		writeSingleByteMethod();
//		readWriteByteByByte();
		readWriteByteByByteImage();
//		ReadFile.readFileUsingFileReader();
//		ReadFile.readFileUsingInputStreamReader();
//		ReadFile.readFileAsBytesAndConvertBackToText();
//		WriteFile.writeToFileUsingFileWriter();
//		WriteFile.writeFileUsingOutputStreamWriter();
//		WriteFile.readTextasByteAndWriteToTextFile();
		
	}
	
	public static void readMethod() throws IOException {
		File file = new File(System.getProperty("user.dir")+"/InputFiles/textFile.txt");
		
		FileInputStream fis = new FileInputStream(file);
		char c;
		int i ;
		while((i = fis.read())!=-1) {
			System.out.println((char)(i));
		}
		fis.close();
	}
	
	public static void readByteArrayMethod() throws IOException {
		File file = new File(System.getProperty("user.dir")+"/InputFiles/textFile.txt");
		
		FileInputStream fis = new FileInputStream(file);
		System.out.println(fis.available());
		byte[] b = new byte[fis.available()];
		System.out.println(b.length);
		System.out.println(fis.read(b));
		fis.close();
	}
	
	
	public static void writeByteArrayMethod() throws IOException {
		File file = new File(System.getProperty("user.dir")+"/OutputFiles/output_file.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		
		byte[] b = {'a','b','c','d'};
		fos.write(b);
	}
	
	//read byte by byte from text file and write into another text file
	public static void readWriteByteByByte() throws IOException {
		File readfile = new File(System.getProperty("user.dir")+"/InputFiles/readme_file.txt");
		File outputfile = new File(System.getProperty("user.dir")+"/OutputFiles/output_file.txt");
		
		FileInputStream fis = new FileInputStream(readfile);
		FileOutputStream fos = new FileOutputStream(outputfile);
		
		int i;
		while ((i = fis.read())!=-1) {
			System.out.println((char)i);
			fos.write(i);
		}
		
	}
	
	//read byte by byte from image file and write into another image file
	public static void readWriteByteByByteImage() throws IOException {
		File readfile = new File(System.getProperty("user.dir")+"/InputFiles/image.jpg");
		File outputfile = new File(System.getProperty("user.dir")+"/OutputFiles/image_out.jpg");
		
		FileInputStream fis = new FileInputStream(readfile);
		FileOutputStream fos = new FileOutputStream(outputfile);
		
		int i;
		while ((i = fis.read())!=-1) {
			fos.write(i);
		}
		
	}
	
	
}
