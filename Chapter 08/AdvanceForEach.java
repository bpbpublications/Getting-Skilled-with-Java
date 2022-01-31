package chapter_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdvanceForEach {

	public static void main(String[] args) {
		Integer arrayValue[] = {1,2,3,4,5};
		  List<Integer> list = new ArrayList<>(Arrays.asList(arrayValue));
		  list.forEach(listItem-> {
		  System.out.println(listItem); 
		  });


	}

}
