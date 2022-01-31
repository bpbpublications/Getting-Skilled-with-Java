package chapter_07;
public class CopyTwoArrays {

	  public static void main(String[] args) {
	  	  int[] a = {9,2,13,6};
	  	  int[] b = {3,5};
	  	  int c[] = a;
	  	  System.out.println("Values of array b. ");
	  	  for(int i=0; i<b.length; i++) {
	  	  	  System.out.println(c[i]);
	  	  }
	  	  int[] d = new int[c.length];
	  	  System.out.println("Values of array c. ");
	      for(int i=0; i<d.length; i++) {
	  	  	  System.out.println(+c[i]);
	  	  	  
	  	  }
	  }
}
