package lec14;

import java.util.*;

//Farmer John has built a new long barn, with N (2 ≤ N ≤ 100,000) stalls. 
//The stalls are located along a straight line at positions x1 ... xN (0 ≤ xi ≤ 1,000,000,000).
//
//His C (2 ≤ C ≤ N) cows don't like this barn layout and become aggressive 
//towards each other once put into a stall. To prevent the cows from hurting 
//each other, FJ wants to assign the cows to the stalls, such that the minimum 
//distance between any two of them is as large as possible. What is the largest minimum distance?
//
//Input
//t – the number of test cases, then t test cases follows.
//
//Line 1: Two space-separated integers: N and C
//Lines 2..N+1: Line i+1 contains an integer stall location, xi
//Output
//For each test case output one integer: the largest minimum distance.
//
//Example
//Input:
//1
//5 3
//1
//2
//8
//4
//9
//
//Output:
//3
//Explanation
//FJ can put his 3 cows in the stalls at positions 1, 4 and 8, resulting in a minimum distance of 3.



public class aggressive_cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nos = sc.nextInt();   // number of stall
		int noc = sc.nextInt();   // number of cows
		int [] stall = new int [nos];
		for(int i = 0; i<stall.length; i++) {
			stall[i] = sc.nextInt();
		}
		
		Arrays.sort(stall);
		maximumDistance(stall, noc);
		
	}
	
	public static int maximumDistance(int [] stall, int noc) {
		int n = stall.length;
		int lo = 0;
		int hi = stall[n-1] - stall[0];
		int ans = 0;
		while(lo <= hi) {
			int mid = (lo+hi)/2;
			if(isitpossible(stall, noc, mid)) {
				ans = mid;
				lo = mid + 1;
			}
			else {
				hi = mid-1;
			}
		}
		return ans;
	}
	
	public static boolean isitpossible(int [] stall, int noc, int mid) {
		int cow = 1;;
		int pos = stall[0];
		for(int i = 1; i<stall.length; i++) {
			if(stall[i] - pos >=mid) {
				cow++;
				pos = stall[i];
			}
			if(noc == cow) {
				return true;
			}
		}
		return false;
	}

}
