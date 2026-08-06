package recursion_42_q;

public class replace_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q31. Replace character 
//		Example: 
//		Input: "cat", a → o 
//		Output: "cot"
		
		String s = "cat";
		System.out.println(Replace(s, ""));
	}
	
	public static String Replace(String s, String ans) {
		
		if(s.length() == 0) {
			return ans;
		}
		if(s.charAt(0) == 'a') {
			ans = ans + 'o';
			return Replace(s.substring(1), ans);
		}
		else {
			ans = ans + s.charAt(0);
			return Replace(s.substring(1), ans);
		}
		
	}

}

