package lec_16;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		int k = 1;
		for(int i = 0; i<=s.length(); i++) {
			System.out.println(s.substring(i,i+k));
			if(i+k == s.length()) {
				k++;
				i=-1;
				if(k>s.length()) {
					break;
				}
			}
			
		}

	}
	


}
