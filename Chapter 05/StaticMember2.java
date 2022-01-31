package chapter_05;

public class StaticMember2 {
	  static int rem ;
	  static {	  	  
	  	  rem = 3;
	  }
	  public static void main(String arg[]) {
	  	  System.out.println(StaticMember.rem);
	  }
}
