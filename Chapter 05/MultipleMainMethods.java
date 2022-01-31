package chapter_05;
public class MultipleMainMethods {

	  public static void main(int[] args) {
	  	  System.out.println("Main with Integer argument.");
	  }
	  public static void main(String[] args) {
	  	  System.out.println("Main with String argument.");
	  	  int[] arr = {1,2,4};
	  	  main(arr);
	  }

}
