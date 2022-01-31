package chapter_10;
public class InterfaceExample implements Car{

	  public static void main(String[] args) {
	  	  InterfaceExample interfaceExample = new InterfaceExample();
	  	  interfaceExample.start();
	  	  System.out.println("Your car is running with speed: "+interfaceExample.speed());
	  }

	  @Override
	  public void start() {
	  	  System.out.println("Engine has been started.");
	  }

	  @Override
	  public int speed() {
	  	  return 50;
	  }
}
