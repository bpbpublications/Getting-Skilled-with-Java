package chapter_12;
import java.util.ArrayList;
public class arrayList {
	   public static void main(String[] args)
	      {
	          ArrayList<String> list = new ArrayList<String>();
	          list.add("FIRST");
	          list.add("SECOND");
	          list.add("THIRD");
	          list.add("FOURTH");
	          list.add("FIFTH");
	   
	          for (int i = 0; i < list.size(); i++) {
	              System.out.println(list.get(i));
	          }
	          System.out.println("Size of array " + list.size());
}
}
