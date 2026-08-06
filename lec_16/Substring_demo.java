package lec_16;

public class Substring_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		System.out.println(s.substring(1,4));
		System.out.println(s.substring(2));
		printAll(s);
		
	}
	
	public static void printAll(String s) {
		for(int i = 0; i<s.length(); i++) {
			for(int j = i+1; j<=s.length(); j++) {
				System.out.println(s.substring(i,j));
			}
		}
	}

}
