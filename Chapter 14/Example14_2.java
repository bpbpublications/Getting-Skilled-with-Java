package chapter_14;

public class Example14_2 {
	  public static void main(String[] args) {
	  	  MyThreadClass myThreadClass = new MyThreadClass();
	  	  Thread t1 = new Thread(myThreadClass);
	  	  t1.start();
	  }
}

class MyThreadClass implements Runnable{
	  @Override
	  public void run() {
	  	  System.out.println("Hello");
	  	  
	  }
}
