package recursion_42_q;

public class count_consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q39. Count consonants 
//		Example: 
//		Input: "code" 
//		Output: 2 
		
		String s = "code";
		System.out.println(count(s, 0));
	}
	
	public static int count(String s, int c) {
		if(s.length() == 0) {
			return c;
		}
		if(s.charAt(0) != 'a' && s.charAt(0) != 'e' && s.charAt(0) != 'i' && s.charAt(0) != 'o' && s.charAt(0) != 'u' ) {
			c++;
		}
		
		return count(s.substring(1),c);
	}

}
