package chapter_03;

public class Example3_8 {
	  void MethodOne(String userName) { // this method received variable userName
	  	  System.out.println(userName);
	  } // After this method closing braces, username will not accessible. 
	  public static void main(String[] args) {
		  Example3_8 pv = new Example3_8();
	  	  pv.MethodOne("Mr. X");

	  }
}
