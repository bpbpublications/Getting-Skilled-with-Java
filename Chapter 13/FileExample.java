package chapter_13;
public class FileExample {

	  public static void main(String[] args) throws IOException {
	  	  File newFile = new File("ListOfCities.txt");
	  	  if (newFile.createNewFile()) {  
            System.out.println("File created.");  
        } else {  
            System.out.println("File exists.");  
        } 
	  }
}
