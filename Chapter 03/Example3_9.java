package chapter_03;

public class Example3_9 {
	  private String withReturnType() {
	  	  System.out.println("Method with return type.");
	  	  return "Rashid";
	  }
	  private void withoutReturnType() {
	  	  System.out.println("Method without return type.");	  	  
	  }
	  public static void main(String[] args) {
		  Example3_9 example = new Example3_9();
	  	  String UserName = example.withReturnType();
	  	  System.out.println(UserName);
	  	  example.withoutReturnType();

	  }
}
