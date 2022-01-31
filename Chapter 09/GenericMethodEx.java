package chapter_09;
public class GenericMethodEx<T> {
	  public static <T> String genericMethod(GenericMethodEx<T> a, GenericMethodEx<T> b){
	  	  return "First generic is " +a.getParams() +", and second generic is "+b.getParams();
	  }
	  
	  private String params;
	  
	  public String getParams() {
	  	  return params;
	  }

	  public void setParams(String params) {
	  	  this.params = params;
	  }

	  public static void main(String[] args) {
	  	  GenericMethodEx<String> gen1 = new GenericMethodEx<>();
	  	  gen1.setParams("GenericOne");
	  	  GenericMethodEx<String> gen2 = new GenericMethodEx<String>();
	  	  gen2.setParams("GenericTwo");
	  	  System.out.println(genericMethod(gen1, gen2));
	  }
}
