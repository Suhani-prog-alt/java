package recursion_42_q;

public class remove_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q32. Remove duplicates 
//		Example: 
//		Input: "aabb" 
//		Output: "ab"
		
		String s = "aaqbb";
		System.out.println(remove_dup(s,""));
	}
	
	public static String remove_dup(String s, String res) {
		if(s.length()==0) {
			return res;
		}
		
		if(!res.contains(s.substring(0,1))) {
			res += s.charAt(0);
		}
		
		return remove_dup(s.substring(1), res);
		
	}

}
