package chapter_03;

public class Example3_3 extends Base{
	  
	  public static void main(String[] args) {
		  Example3_3 exampleTest = new Example3_3();
	  	  Base base = new Base();
	  	  base.MethodEx();
	  }
}

class Base {
	  private void MethodEx() {
	  	  System.out.println("Base class method");
	  }
}
