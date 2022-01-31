package chapter_11;
import java.io.File;
import java.io.PrintWriter;

public class TryWithResources {
	  public static void main(String[] args) {
	  	  try (PrintWriter writer = new PrintWriter(new File("data.txt"))) {
	  	  	  writer.print("this is a file written using try with resources.");
	  	  } catch(Exception e) {
	  	  	  System.out.println(e);
	  	  } finally {
	  	  	  System.out.println("File writing completed.");
	  	  }
	  }
}
