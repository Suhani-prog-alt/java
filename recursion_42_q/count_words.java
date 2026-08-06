package recursion_42_q;

public class count_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q33. Count words 
//		Example: 
//		Input: "I love code" 
//		Output: 3
		
		String s = "I love code";
		System.out.println(count_w(s, 1));
	}
	
	public static int count_w(String s, int word) {
		if(s.length()==0) {
			return word;
		}
		
		if(s.charAt(0) == ' ') {
			word++;
		}
		
		return count_w(s.substring(1), word);
	}

}
