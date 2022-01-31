package chapter_13;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {

	  public static void main(String args[]) {
	  	  try {
	  	  	  OutputStream oStream = new FileOutputStream("Output.txt");
	  	  	  oStream.write(70);
	  	  	  oStream.write(65);
	  	  	  oStream.write(78);
	  	  	  oStream.close();
	  	  	  System.out.println("Successfully created and written the file.");
	  	  } catch (IOException e) {
	  	  	  System.out.print("Exception");
	  	  }	  
	  }
}
