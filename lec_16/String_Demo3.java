package lec_16;

public class String_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello"+10+20+"bye");  // act as a string
		System.out.println("hello"+(10+20)+"bye");  // firstly, it will solve braces 
		System.out.println(10+20+"hello"+"bye");
		String s1 = "hellobye";
		System.out.println(s1.length());  // it's a method/function
		
		int [] arr = new int [4];
		System.out.println(arr.length);  // it is a variable
		System.out.println(s1.charAt(1));  // character at 1 index
	}

}
