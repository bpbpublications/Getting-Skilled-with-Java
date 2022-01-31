package chapter_03;

public class FinalVariable {
	  final int AGE = 5;
	  
	  public void AccessVariable() {
	  	  System.out.println(AGE);	  	  
	  }
	  public static void main(String[] args) {
	  	  FinalVariablefinalVariable = new FinalVariable();
	  	  finalVariable.AccessVariable();
	  }
}
