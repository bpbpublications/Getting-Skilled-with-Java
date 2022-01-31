package chapter_01;

public class TestPro {

	public static void main(String[] args) {
		String str = "cagClassification/1.0/SPIRITS-.WHISKY_CL.ASSIFICATION.country";
		str = str.substring(str.lastIndexOf(".")+1);
		System.out.println(str);
	}

}
