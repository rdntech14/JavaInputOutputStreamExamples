Java Input Output Stream Examples explains how to read or write a file in JAVA
=====

# Read from file

1) Using FileReader and Buffer Reader (only for text files)
2) Using FileInputStream, InputStreamReader, BufferReader (can be used for Image)
3) Using FileInputStream, byte array, String decoder (can be used for Image)
	 
Method 1 ( Advance way only for text files, not for bytes)
//	FileReader ( read and converts byte stream into character stream with system charset) —> BufferReader ( reads text from character-input stream)

**Note : Use FileReader/FileWriter when number of write operations are less**

```
BufferReader br = new BufferReader(new FileReader(file));
```

Method 2 ( can be used for bytes or text files)
//	InputStream ( provides sequence of bytes) —> FileInputStream (reads sequence of bytes)—> InputStreamReader ( convert bytes stream into character stream with provided charset) —> BufferReader ( reads text from character-input stream)

InputStream
FileInputStream
InputStreamReader
BufferReader

```
BufferReader br = new BufferReader(new InputStreamReader(new FileInputStream(file)));
```

InputStream is an abstract class so it object can.

FileInputStream implements InputStream.
InputStreamReader converts bytes into character stream using system/default charaset or provided charset

```
InputStreamReader = new InputStreamReader(new FileInputStream(file));  //for default system charaset
InputStreamReader = new InputStreamReader(new FileInputStream(file), "UTF-8");  //for provided charaset
```

***Method readFileAsBytesAndConvertBackToText() shows how to read text file as bytes***

This is an example of how to read a File in a byte array using a FileInputStream. The FileInputStream obtains input bytes from a file in a file system. Reading a file in a byte array with a FileInputStream implies that you should:

Create a new File instance by converting the given pathname string into an abstract pathname.
Create a FileInputStream by opening a connection to an actual file, the file named by the path name name in the file system.
Create a byte array with size equal to the file length.
Use read(byte[] b) API method of FileInputStream to read up to certain bytes of data from this input stream into the byte array.
Create a String from the byte array.
Don’t forget to close the FileInputStream, using the close() API method.

```
FileInputStream fis = new FileInputStream(file);
byte[] fileContent = new byte[(int)file.length()];
fis.read(fileContent);
		
System.out.println(" **** decoding byte array into text");
String s = new String(fileContent); // String class has a constructor which takes byte[] and decode into String using system charaset
System.out.println(s);
```

# Write to file

Method 1:

```
FileWriter fw = new FileWriter(file);
BufferedWriter bw = new BufferedWriter(fw);
```

Method 2:

OutputStream

FileOutputStream

OutputStreamWriter

BufferWriter

```
FileOutputStream fos = new FileOutputStream(outfile) ;
OutputStreamWriter osw = new OutputStreamWriter(fos);
BufferedWriter bw = new BufferedWriter(osw);
```
Method 3: WriteFile.readTextasByteAndWriteToTextFile();

```
FileInputStream fis = new FileInputStream(infile);
byte[] fileContentByteArray = new byte[(int)infile.length()];
FileOutputStream fos = new FileOutputStream(outfile);
fos.write(fileContentInString.getBytes(), 0, fileContentInString.length());

```

```
String fileContentInString = new String(fileContentByteArray);
fos.write(fileContentInString.getBytes(), 0, fileContentInString.length());
```

**Note**

```
InputStream & OuputStream are abstract classes.
```

**Note : define byte array using file object**

```
byte[] fileContentByteArray = new byte[(int)file.length()];

```

**Note : Decoding - Convert byte code array into String using String constructor method.**

```
String fileContentInString = new String(fileContentByteArray);
```

**Note : String.getBytes() method converts string into byte Array**

```
char[] charArray = s.toCharArray();

```

***Examples*** 

ReadFile.readFileUsingFileReader();            
ReadFile.readFileUsingInputStreamReader();     
ReadFile.readFileAsBytesAndConvertBackToText();

WriteFile.writeToFileUsingFileWriter();    
WriteFile.writeFileUsingOutputStreamWriter();  
WriteFile.readTextasByteAndWriteToTextFile();  


***************************************************

**Streams***
Streams are two types 
1) InputStream ( Binary & Character)
2) OutputStream

FileInputStream Methods :

public int available(): returns an estimate of the number of remaining bytes that can be read.
public int read(): reads one byte of data, returns the byte as an integer value. Return -1 if the end of the file is reached.
public int read(byte[]): reads a chunk of bytes to the specified byte array, up to the size of the array. This method returns -1 if there’s no more data or the end of the file is reached.
public int read(byte[], int offset, int length): reads up to length bytes of data from the input stream. 

FileInputStream fis = new FileInputStream(file) // FileInputStream has constructor to accept File object or String as filepath, does not have to accept inputStream.

To inputStreamReader can accept inputStream or FileInputStream


