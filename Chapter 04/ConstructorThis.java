package chapter_04;
public class ConstructorThis
{
	  ConstructorThis()
	  {	  
	  	  this(2);
	  	  System.out.println("Default Constructor.");

	  }
	  ConstructorThis(int i)
	  {
	  	  this(2,3);
	  	  System.out.println("Constructor with one argument.");
	  }
	  ConstructorThis(int i, int j)
	  {
	  	  this(2,3,4);
	  	  System.out.println("Constructor with two arguments.");
	  }
	  ConstructorThis(int i, int j, int k)
	  {
	  	  System.out.println("Constructor with three arguments.");
	  }

	  public static void main(String[] args) {
	  	  ConstructorThis constructorThis = new ConstructorThis();
	  }
}
