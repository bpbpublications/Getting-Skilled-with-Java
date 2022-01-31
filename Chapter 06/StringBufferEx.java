package chapter_06;
	
public class StringBufferEx {
  public static void main(String[] args) {
  	  {
  	  	  StringBuffer sb = new StringBuffer();
  	  	  System.out.println(sb.capacity());
  	  	  sb.append("This is an ");
  	  	  sb.append("object of ");
  	  	  sb.append("StringBuffer");
  	  	  System.out.println(sb);
	  	  	  sb.delete(0, 4);
	  	  	  sb.insert(0, "That");
	  	  	  System.out.println(sb);
	  	  	  sb.reverse();
	  	  	  System.out.println(sb);
	  	  	  System.out.println(sb.capacity());
	  	  }
	  }
}
