package lec6;

import java.util.*;

public class Data_types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 5;
		short s = 5;
		int i = 5;
		long l = 5000000000l; //literal changes into long, but number does not change
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		Scanner sc = new Scanner(System.in);
		b = sc.nextByte();
		s = sc.nextShort();
		i = sc.nextInt();
		l = sc.nextLong();
		

	}

}
