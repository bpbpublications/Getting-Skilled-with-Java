package chapter_10;
public class Flora extends Flower{

	  public static void main(String[] args) {
	  	  Flora flora = new Flora();
	  	  flora.flowerName("Marigold");
	  	  flora.flowerRose();
	  }
	  
	  @Override
	  public void flowerName(String name) {
	  	  System.out.println("I'm a flower. My name is "+name +".");
	  }
	  
	  @Override
	  public void flowerRose() {
	  	  System.out.println("I'm Rose. My color is White.");
	  }
}
