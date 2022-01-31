package chapter_12;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetCollection
{
    public static void main(String[] args)
    {
        HashSet<String> cities = new HashSet<String>();
       //  Below line of code will remove element from HashSet
        cities.add("New Delhi");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Kolkata");
        //Below line of code will remove element from HashSet
        cities.remove("New Delhi");
        
        Iterator iterator = cities.iterator();
while(iterator.hasNext()) {
	  String nameOfCity=(String) iterator.next();
	  	  System.out.println(nameOfCity);
	  } 
    }
}
