package lec_19;

public class frequency_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "sadqwertyuioplkjhffdsazxcvnmmkjyt";
		int [] arr = new int [26];
		for(int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			arr[ch - 'a']++;
		}
		
	}

}
