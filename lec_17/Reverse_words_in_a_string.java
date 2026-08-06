package lec_17;

public class Reverse_words_in_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "	the sky   is  blue  ";
		s = s.trim();  // to remove space from sides, to remove space from sides
		
		String [] arr = s.split(" +");  // this is used split at once more than single spaces
		String ans = "";
		for(int i = arr.length-1; i>=0; i--) {
			ans+= arr[i] + " ";
		}
		
		System.out.print(ans.trim());
	}

}
