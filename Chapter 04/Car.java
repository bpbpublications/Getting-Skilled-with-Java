package chapter_04;
public class Car {

	  Car() { //Default constructor
	  	  System.out.println("default constructor");
	  }
	  Car(int types) { //constructor with an integer parameter
	  	  System.out.println("constructor with an integer parameter");
	  }
	  Car(String model) { //constructor with a string parameter
	  	  System.out.println("constructor with a string parameter");
	  }
	  Car(float milage) { //constructor with a float parameter
	  	  System.out.println("constructor with a float parameter");
	  }
	  Car(String model, int tyres) { //constructor with two parameters sting and integer
	  	  System.out.println("constructor with two parameters sting and integer");
	  }
	  Car(int types, String model) { //constructor with two parameters integer and string
	  	  System.out.println("constructor with two parameters integer and string");
	  }
	  public static void main(String[] args) {
	  	  Car car = new Car();
	  	  new Car(2);
	  	  new Car("Porsche");
	  	  new Car(3.4f);
	  	  new Car("Maruti", 4);
	  	  new Car(6, "Honda");
	  }
}
