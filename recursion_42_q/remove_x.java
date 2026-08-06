package recursion_42_q;

public class remove_x {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q40. Remove character x 
//		Example: 
//		Input: "xoxo" 
//		Output: "oo" 
		
		String s = "xoxo";
		System.out.println(rem(s, ""));
	}
	
	public static String rem(String s, String ans) {
		if(s.length() == 0) {
			return ans;
		}
		
		if( s.charAt(0)!='x') {
			ans += s.charAt(0);
		}
		return rem(s.substring(1), ans);
	}

}
