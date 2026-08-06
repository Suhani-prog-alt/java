package lec_16;

public class String_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";  // in string pool
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = new String("hello");
		
		String s = s1+"bye";  // s1.concat("bye");
		String s5 = "hello"+"bye";  // in string pool
	}

}
