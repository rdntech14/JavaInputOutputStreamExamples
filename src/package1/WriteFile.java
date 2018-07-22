package package1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WriteFile {


	/*Write to a file
	input --> word/text present as object
	input --> a file 
	input --> a stream
	  
	 */
	
	public static void writeToFileUsingFileWriter() throws IOException {
		
		System.out.println("File Path : " + System.getProperty("user.dir")+"/OutputFiles/output_file.txt");
		File file = new File(System.getProperty("user.dir")+"/OutputFiles/output_file.txt");
		
		FileWriter fw = new FileWriter(file);
//		FileWriter fw = new FileWriter(file, true); //to append text
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hello");
        bw.write("\r\n");   // write new line
        bw.write("World");
        bw.newLine();
        bw.write("Good Bye!");
		
		bw.close();
		fw.close();
	}
	
	public static void writeToAFileUsingOutputStreamWriter() throws IOException {
		
		String input = "this is text to be written.\n"
				+ " here is list of companies\n" + 
				"Amazon\n" + 
				"Apple";
		
		
		System.out.println("File Path : " + System.getProperty("user.dir")+"/OutputFiles/output_file.txt");
		File file = new File(System.getProperty("user.dir")+"/OutputFiles/output_file.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write(input);
		
		bw.close();
		osw.close();
		fos.close();
	}
	
	public static void writeFileUsingOutputStreamWriter() throws IOException {
		
		System.out.println("Inout File Path : " + System.getProperty("user.dir")+"/InputFiles/readme_file.txt");
		File infile = new File(System.getProperty("user.dir")+"/InputFiles/readme_file.txt");
		
		System.out.println("Outout File Path : " + System.getProperty("user.dir")+"/OutputFiles/output_file.txt");
		File outfile = new File(System.getProperty("user.dir")+"/OutputFiles/output_file.txt");
		
		 FileInputStream fis = new FileInputStream(infile);
		 byte[] fileContent = new byte[(int)infile.length()];
		fis.read(fileContent);
		
		String s = new String(fileContent);
		System.out.println("file content : \n" + s);
		
		// Connecting Reading and writing by passing text as string.
		
		FileOutputStream fos = new FileOutputStream(outfile) ;
//		FileOutputStream fos = new FileOutputStream(outfile, true) ; // to append text
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		// write using string input.
		bw.write(s);
		
		// write using char array input.
		char[] charArray = s.toCharArray();
		bw.write(charArray);
		bw.write(charArray, 0, charArray.length);
		
		
		if (bw != null)
			bw.close();

		if (osw != null)
			osw.close();
		
		if (fos != null)
			fos.close();
	}
	
public static void readTextasByteAndWriteToTextFile() throws IOException {
		// Read file content in bytes or String
		System.out.println("Inout File Path : " + System.getProperty("user.dir")+"/InputFiles/readme_file.txt");
		File infile = new File(System.getProperty("user.dir")+"/InputFiles/readme_file.txt");
		
		System.out.println("Outout File Path : " + System.getProperty("user.dir")+"/OutputFiles/output_file.txt");
		File outfile = new File(System.getProperty("user.dir")+"/OutputFiles/output_file.txt");
		
		 FileInputStream fis = new FileInputStream(infile);
		 byte[] fileContentByteArray = new byte[(int)infile.length()];
		
		 fis.read(fileContentByteArray);
		 System.out.println("fileContentByteArray : \n " +fileContentByteArray);
		
		String fileContentInString = new String(fileContentByteArray);
		System.out.println("file content in String: \n" + fileContentInString);
		
		// Write content from input as byte or String to a file
		
		FileOutputStream fos = new FileOutputStream(outfile);

		// write to a file from String input
		fos.write(fileContentInString.getBytes(), 0, fileContentInString.length());
		
		// write to a file from byteArray input
		fos.write(fileContentByteArray);
		
		if (fos != null)
			fos.close();
	}
	
}
