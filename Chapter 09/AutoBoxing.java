package chapter_09;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxing {
public static void main(String[] args) {
  	  int roll = 1234; 
  	  List<Integer> list = new ArrayList<Integer>();
  	  list.add(roll);
  	  System.out.println(list.get(0) instanceof Integer);
	  }
}
