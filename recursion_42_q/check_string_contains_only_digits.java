package recursion_42_q;

public class check_string_contains_only_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q42. Check string contains only digits 
//		Example: 
//		Input: "1234" 
//		Output: True 
		
		String s = "124e34";
		System.out.println(check(s));
	}
	
	public static String check(String s) {
		if(0 == s.length()) {
			return "True";
		}
		
		if(!(s.charAt(0)>= '0' && s.charAt(0)<='9')) {
			return "False";
		}
		
		return check(s.substring(1));
	}
}
