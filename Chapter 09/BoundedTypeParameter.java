package chapter_09;
public class BoundedTypeParameter<T extends Number> {

	  private T params;
	  
	  public T getParams() {
	  	  return params;
	  }

	  public void setParams(T params) {
	  	  this.params = params;
	  }

	  public static void main(String[] args) {
	  	  	  BoundedTypeParameter<Integer> gen2 = new BoundedTypeParameter<>();
	  	  	  gen2.setParams(123);
	  	  }
}
