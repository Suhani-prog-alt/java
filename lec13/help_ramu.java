package lec13;

import java.util.Scanner;

public class help_ramu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			int c4 = sc.nextInt();
			t--;
		}
		
		
	}
	
	public static int minimum_sum(int[] rick, int[] cabs, int c1, int c2, int c3, int c4) {
		int cost_rick = 0;
		for(int i = 0; i<rick.length; i++) {
			cost_rick += Math.min(c1*rick[i], c2);
		}
		cost_rick = Math.min(c3, cost_rick);
		
		int cost_cab = 0;
		for(int i = 0; i<cabs.length; i++) {
			cost_cab += Math.min(c1*cabs[i], c2);
		}
		cost_cab = Math.min(c3, cost_cab);
		
		int total = cost_cab + cost_rick;
		return Math.min(total, c4);
	}

}
