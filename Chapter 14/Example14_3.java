package chapter_14;

public class Example14_3 {
	  public static void main(String[] args) {
	  	  MyThreadClass myThreadClass = new MyThreadClass();
	  	  Thread t1 = new Thread(myThreadClass);
	  	  t1.start();
	  	  t1.start();	  
	  }
}

class MyThreadClass implements Runnable{
	  @Override
	  public void run() {
	  }
}
