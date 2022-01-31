package chapter_10;
public class MethodOverloading {

	  public static void main(String[] args) {
	  	  MethodOverloading mo = new MethodOverloading();
	  	  System.out.println(mo.addTwoNumber(4.3F, 88.12F));
	  	  System.out.println(mo.addTwoNumber(2, 3));
	  }
	  
	  private int addTwoNumber(int a, int b) {
	  	  return a*b;
	  }
	  private String addTwoNumber(float a, float b) {
	  	  return "Addition of two float numbers is : " +a*b;
	  }
}
