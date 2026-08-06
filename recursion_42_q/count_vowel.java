package recursion_42_q;

public class count_vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q20. Count vowels in string 
//		Example: 
//		Input: "coding" 
//		Output: 2 
		
		String s ="coding";
		System.out.println(count(s, 0, 0));
	}
	
	public static int count(String s, int i, int c) {
		if(i == s.length()) {
			return c;
		}
		if(s.charAt(i)== 'a' ||s.charAt(i)== 'e' ||s.charAt(i)== 'i' ||s.charAt(i)== 'o' ||s.charAt(i)== 'u' ||s.charAt(i)== 'A' ||s.charAt(i)== 'E' ||s.charAt(i)== 'I' ||s.charAt(i)== 'O' ||s.charAt(i)== 'U'  ) {
			c++;
		}
		return count(s, i+1, c);
	}

}
