package package1;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Main {

	public static void main(String[] args) throws Exception  {
		
		
		
		ReadFile.readFileUsingFileReader();
		ReadFile.readFileUsingInputStreamReader();
		ReadFile.readFileAsBytesAndConvertBackToText();
		WriteFile.writeToFileUsingFileWriter();
		WriteFile.writeFileUsingOutputStreamWriter();
		WriteFile.readTextasByteAndWriteToTextFile();
		
	}
	
}
