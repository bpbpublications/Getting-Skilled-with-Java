package chapter_14;

class MyThreadClass extends Thread {
	public void run() {
		System.out.println("Hello");
	}
}
public class Example14_1 {
	public static void main(String s[]) {
		MyThreadClass t1=new MyThreadClass ();
		MyThreadClass t2=new MyThreadClass ();
		t1.start();
		t2.start();
	}
}
