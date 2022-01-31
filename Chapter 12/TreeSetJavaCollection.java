package chapter_12;
import java.util.TreeSet;

public class TreeSetJavaCollection
{
    public static void main(String[] args)
    {
        TreeSet<String> treeSet = new TreeSet<String>();
 
        //Adding elements to treeSet
        treeSet.add("A");      
        treeSet.add("Z");    
        treeSet.add("N");      
        treeSet.add("K");
        treeSet.add("B");
        treeSet.add("D");
        treeSet.add("Y");

        System.out.println(treeSet);
    }
}
