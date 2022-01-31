package chapter_03;

public class Example3_2 {
	  
	  public void MethodEx() {
	  	  private String firstName = "Priyank";
	  }
	  
	  public static void main(String[] args) {
		  Example3_2 exampleTest = new Example3_2();
	  	  exampleTest.firstName = "Raju"; // we cannot access this private variable in main method.
	  }
}
