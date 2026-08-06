package lec_25;

public class count_SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abs";
//		Print(ques, "");
//		System.out.println("\n"+count);
		
		System.out.println("\n"+Print(ques,""));
	}
	
//	static int count = 0;
	
	public static int Print(String ques, String ans) {
		if(ques.length() == 0) {
			System.out.println(ans);
			return 1;
		}
		
		char ch = ques.charAt(0);
		int a1 = Print(ques.substring(1), ans);
		int a2 = Print(ques.substring(1), ans+ch);
		return a1+a2;

	}
	
//	public static void Print(String ques, String ans) {
//		if(ques.length() == 0) {
//			System.out.println(ans);
//			count++;
//			return;
//		}
//		
//		char ch = ques.charAt(0);
//		Print(ques.substring(1), ans);
//		Print(ques.substring(1), ans+ch);
//
//	}

}
