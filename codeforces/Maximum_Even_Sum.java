package codeforces;

import java.util.Scanner;

public class Maximum_Even_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 0;
		while(n>0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(b == 1) {
				k = 1;
			}
			else {
				for(int i = 2; i<=b; i++) {
					if(b%i==0) {
						if((b/i) == )
						k = i;
						break;
					}
				}
			}
			a = a*k;
			b = b/k;
			n--;
			if((a+b)%2==0) {
				System.out.println(a+b);
			}
			else {
				System.out.println("-1");
			}
		}
	}

}
