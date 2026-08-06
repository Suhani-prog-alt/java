package codeforces;

import java.util.*;
public class sublime_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			Sublime(a,b);
			
		}
	}
	
	public static void Sublime(int a, int b) {
		if(b%2==0) {
			System.out.println("0");
		}
		else {
			System.out.println(a);
		}
	}

}
