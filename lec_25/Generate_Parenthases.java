package lec_25;

public class Generate_Parenthases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		Parentheses(n, 0, 0, "");
	}
	
	public static void Parentheses(int n, int open, int closed, String ans) {
		
		if(open == n && closed == n) {
			System.out.println(ans);
			return;
		}
		
		if(open > n || closed > open) {
			return;
		}
		
		Parentheses(n, open+1, closed, ans + '(');
		Parentheses(n, open, closed+1, ans + ')');
	}

}
