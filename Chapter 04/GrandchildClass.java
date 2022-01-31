package chapter_04;
public class GrandchildClass extends ChildClass {
	  GrandchildClass() {
	  	  System.out.println("Constructor from grandchild class.");
	  }

	  public static void main(String[] args) {
	  	  GrandchildClass cp = new GrandchildClass();

	  }
}

class ChildClass extends ParentClass {
	  ChildClass() {
	  	  System.out.println("Constructor from child class.");
	  }
}

class ParentClass {
	  ParentClass() {
	  	  System.out.println("Constructor from parent class.");
	  }
}
