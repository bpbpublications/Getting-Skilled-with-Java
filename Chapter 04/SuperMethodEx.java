package chapter_04;
public class SuperMethodEx extends SuperClass {
	  public SuperMethodEx() {
	  	  super("Jorvee");
	  }

	  public static void main(String[] args) {
	  	  SuperMethodEx superMethodEx = new SuperMethodEx();

	  }
}

class SuperClass {
	  
	  SuperClass(String name) {
	  	  System.out.println("This constructor received name argument " + name);
	  }
}
