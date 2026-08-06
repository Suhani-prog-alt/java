package lec15;

import java.util.Scanner;

public class input_output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt(); // row
		int m = sc.nextInt(); // col
		
//		int arr [][]= new int [n][m];     //c type declaration
//		int [] [] arr = new int [n] [];   // can make a array
		int [] [] arr = new int [n][m];
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		Display(arr);  //5544
	}
	
	public static void Display(int [][] arr) {
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
