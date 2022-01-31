package chapter_11;
public class MainClass {
	  
	  public static void main(String[] args) {
	  	  try{
	  	  	  String error = "Exception occurred due to custom exception triggered.";
	  	  	  throw new CustomException(error);
	  	  }
	  	  catch(CustomException e) {
	  	  	  System.out.println(e);
	  	  }
	  	  finally{
	  	  	  System.out.println("Execution of the exception completed.");
	  	  }
	  }
}
/**
 * This class is to define the custom exception class.
 */
class CustomException extends Exception {
	  String errmsg;
	  public CustomException(String errorMessage) {
	  	  errmsg = errorMessage;
	  }
	  public String toString(){
	  	  return "Custom Exception occurred:: " +errmsg;
	  }
}
