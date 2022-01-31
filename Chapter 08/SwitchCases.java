package chapter_08;

public class SwitchCases {

	public static void main(String[] args) {
		String color = "red";
		switch(color) {
			  case "red": 
			  	  System.out.println("Color is red.");
			  	  break;
			  case "yellow": 
			  	  System.out.println("Color is yellow.");
			  	  break;
		default:
			  System.out.println("Not matched!");
		}

	}

}
