package lec_17;

import java.util.Scanner;

public class playing_with_good_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(largestString(s));
	}
	
	public static int largestString(String s) {
		int count = 0;
		int ans = 0;
		for(int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
			}
			else {
				ans = Math.max(ans, count);
				count = 0;
			}
		}
		ans = Math.max(ans, count);
		return ans;
	}

}
