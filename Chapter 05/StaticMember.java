package chapter_05;
public class StaticMember extends StaticBase{
	  static int score = 4 ;
	  public static void main(String arg[]) {
	  	  StaticMember staticMember = new StaticMember();
	  	  System.out.println("Static variable without class and object reference: " +score);
	  	  System.out.println("Static variable accessed with the help of object of class: " +staticMember.score);
	  	  score = 6; // updated the value of score variable to 6.
	  	  StaticMember staticMemberTwo = new StaticMember();
	  	  System.out.println("Static variable without class and object reference: " +score);
	  	  System.out.println("Static variable accessed with the help of object of class: " +staticMemberTwo.score);
	  	  
	  }
}

class StaticBase {
	  StaticBase() {
	  	  System.out.println("Value of static variable score in base class: " +StaticMember.score);
	  }
}
