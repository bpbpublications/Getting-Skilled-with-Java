package chapter_05;

public class Example5_5 {

	int countryCode;
	  static {
	  	  countryCode = 91; //Cannot make a static reference to the non-static field countryCode
	  	  
	  	  static { // this is illegal, we cannot create nested static
	  	  	  System.out.println("Static block inside static");
	  	  }
	  }

}
