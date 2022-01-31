package chapter_03;

public class Example3_10 {
	  private String withReturnType(String name) {
	  	  System.out.println("Method with return type name = " +name);
	  	  return name;
	  }
	  private void withoutReturnType(int number) {
	  	  System.out.println("Method without return type value: " +number);	  	  
	  }
	  public static void main(String[] args) {
		  Example3_10 example = new Example3_10();
	  	  String UserName = example.withReturnType("Alice");
	  	  System.out.println(UserName);
	  	  example.withoutReturnType(5);

	  }
}
