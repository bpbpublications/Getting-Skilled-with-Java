package chapter_08;

public class NestedForLoop {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
		  	  System.out.println("Value of i "+i);
		  	  for(int j=1; j<=i; j++) {
		  	  	  System.out.println("value of j is " +j);
		  	  }
		  }

	}

}
