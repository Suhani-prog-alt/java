package lec7;

import java.util.*;
public class inverse_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Inverse(n));
		
	}

	public static int Inverse(int n) {
		int place = 1;
		int sum = 0;
		while(n>0) {
			int rem = n%10;
			sum = sum + (int)(place*Math.pow(10,rem-1 ));
			n = n/10;
			place++;
		}
//		System.out.println(sum);
		return sum;
	}
}
