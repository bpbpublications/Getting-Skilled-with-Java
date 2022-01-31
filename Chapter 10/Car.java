package chapter_10;
public interface Car {
	  void start();
	  int speed();
	  default String model() {
	  	  return "This is a luxury car";
	  }
}
