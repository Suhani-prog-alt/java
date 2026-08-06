package recursion_42_q;

public class string_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q29. String palindrome 
//		Example: 
//		Input: "madam" 
//		Output: True 
		
		String s = "madam";
		int i = 0;
		int j = s.length()-1;
		System.out.println(Palindrome(s,i,j));
		
	}
	
	public static String Palindrome(String s, int i, int j) {
		if(i<=j && s.charAt(i) == s.charAt(j)) {
			i++;
			j--;
			return Palindrome(s, i, j);
		}
		if(s.charAt(i) != s.charAt(j)) {
			return "False";
		}
		return "True";
		
		
	}

}
