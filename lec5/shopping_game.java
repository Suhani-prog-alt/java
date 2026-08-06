package lec5;
import java.util.Scanner;
public class shopping_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();  //Aayush
		int n = sc.nextInt();  //Harshit
		int a = 0 ;
		int h = 0;
		int phone = 1;
		while(true) {
			a = a+phone;
			if(a>m) {
				System.out.println("Harshit");
				break;
			}
			phone++;
			h = h+phone;
			if(h>n) {
				System.out.println("Aayush");
				break;
			}
			phone++;
		}
	}

}
