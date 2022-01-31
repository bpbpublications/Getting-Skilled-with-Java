package chapter_09;
public class GenericsWithTypeParam<T> {
	  private T type;
	  
	  public T getType() {
	  	  return type;
	  }

	  public void setType(T type) {
	  	  this.type = type;
	  }

	  public static void main(String[] args) {
	  	  GenericsWithTypeParam<String> typeString = new GenericsWithTypeParam<String>();
	  	  typeString.setType("I am String generic type.");
	  	  System.out.println(typeString.getType());
	  }
}
