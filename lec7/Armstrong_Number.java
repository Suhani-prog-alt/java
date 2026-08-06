package lec7;

import java.util.*;
public class Armstrong_Number {
	
	public static int count_of_digit(int n) {
		int count = 0;
		while (n>0) {
			count+=1;
			n= n/10;
		}
		return count;
	}
	
	
	public static boolean IS_armstrong(int n) {
		int c = count_of_digit(n);
		int m = n;
		int sum = 0;
		while (n>0) {
			int rem = n%10;
			sum = (int)(sum + Math.pow(rem, c));
			n = n/10;
		}
		if (sum == m) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(IS_armstrong(n));
		
		
		
		
		
	}
	
	

}
