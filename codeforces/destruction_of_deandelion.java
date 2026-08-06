package codeforces;

import java.util.Scanner;

public class destruction_of_deandelion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			long m = sc.nextLong();
			long [] arr = new long [m];
			for(long j = 0; j<m; j++) {
				arr[i] = sc.nextInt();
			}
			
		}
	}
	public static void Deandelion(long [] arr) {
		long odd_count = 0;
		for(int i = 0; i< arr.length; i++) {
			if(arr[i]%2!=0) {
				odd_count++;
			}
		}
		if(odd_count == 0) {
			System.out.println("0");
		}
		else if(odd_count == 1) {
			long sum = 0;
			for(int i = 0; i<=arr.length; i++) {
				sum = sum + arr[i];
			}
			System.out.println(sum);
		}
		else if ()
	}

}
