package chapter_05;
public class StaticMem {
	  static int countryCode;
	  static void staticMethod() {
	  	  countryCode = 23;
	  	  final String name = "India";
	  	  String lastName = "AA";
	  	  System.out.println(lastName);
	  }
	  public static void main(String[] args) {
	  	  staticMethod();
	  }

}
