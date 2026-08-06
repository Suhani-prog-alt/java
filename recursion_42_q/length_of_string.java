package recursion_42_q;

public class length_of_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q30. Length of string 
//		Example: 
//		Input: "hello" 
//		Output: 5 
		
		String s = "hello";
		System.out.println(Len(s, 0));
	}
	
	public static int Len(String s, int c) {
		if(s.length()==0) {
			return c;
		}
		
		return Len(s.substring(1), c+1);
	}

}
