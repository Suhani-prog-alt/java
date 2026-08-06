package lec_24;

public class no_2_continuous_HH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		print(n,"");
	}
	
//	public static void print(int n, String ans) {
//		if(n==0) {
//			System.out.println(ans);
//			return;
//		}
//		if(ans.length() == 0 || ans.charAt(ans.length()-1!='H')) {
//			print(n-1, ans+'H');
//		}
//		
//		print(n-1, ans + 'T');
//	}
	
	public static void print(int n, String ans) {
		if(n == 0 && !ans.contains("HH")){
			System.out.println(ans);
			return;
		}else if(ans.contains("HH")) {
			return;
		}
		
		if(!ans.contains("HH")) {
			print(n-1, ans + 'H');
		}
		print(n-1, ans + 'T');

	}

}
