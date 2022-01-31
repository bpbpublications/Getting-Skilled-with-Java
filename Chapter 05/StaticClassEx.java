package chapter_05;
public class StaticClassEx {
	  static class InnerClass {
	  }
	  class InnerNoStatic {
	  }
	  public static void main(String[] args) {
	  	  InnerNoStatic noStatic = new InnerNoStatic(); // No enclosing instance of type StaticClassEx is accessible. Must qualify the allocation with an enclosing instance of type StaticClassEx (e.g. x.new A() where x is an instance of StaticClassEx).
	  	  InnerClass innerClass = new InnerClass();
	  }
}
