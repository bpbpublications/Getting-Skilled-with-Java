package chapter_13;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileAndBufferedReader
{
	  public static void main(String[] args) throws IOException
	  {
	  	  FileReader fReader = new FileReader("SampleFile.txt");
	  	  BufferedReader bReader = new BufferedReader(fReader);
	  	  int records;
	  	  while((records = bReader.read()) != -1) {
	  	  	  System.out.print((char)records);
	  	  }
	  	  bReader.close();
	  	  fReader.close();
	  }
}
