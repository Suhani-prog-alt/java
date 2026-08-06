package lec14;

import java.util.Scanner;

//You are given number of pages in n different books and m students. 
//The books are arranged in ascending order of number of pages. Every 
//student is assigned to read some consecutive books. The task is to 
//assign books in such a way that the maximum number of pages assigned to a student is minimum.
//
//Input format
//
//First line contains integer t as number of test cases.
//Next t lines contains two lines.
//For each test case, 1st line contains two integers n and m which represents the number of books and students and 2nd line contains n space separated integers which represents the number of pages of n books in ascending order.
//
//
//Output format
//
//Print the maximum number of pages that can be assigned to students.
//
//
//Example 1
//
//Input
//
//1
//4 2
//12 34 67 90
//
//
//Output
//
//113
//
//
//Explanation
//
//1st students : 12 , 34, 67 (total = 113) 
//
//2nd students : 90 (total = 90) 
//
//Print max(113, 90)
//
//
//Constraints
//
//1 < t < 50 
//
//1< n < 100 
//
//1< m <= 50 
//
//1 <= Ai <= 1000

public class Book_Allocation_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nob = sc.nextInt();   // number of books
		int nos = sc.nextInt();   // number of students
		int [] page = new int [nob];
		for(int i = 0; i<page.length; i++) {
			page[i] = sc.nextInt();
		}
		Minimumpage(page,nos);
	}
	
	public static int Minimumpage(int [] page, int nos) {
		int lo = 0;
		int hi = 0;
		int ans = 0;
		for(int i = 0; i< page.length ; i++) {
			hi = hi + page[i];
		}
		
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(isitpossible(page,nos,mid)) {
				ans = mid;
				hi = mid -1;
			}
			else {
				lo = mid + 1;
			}
		}
		return ans;
	}
	
	public static boolean isitpossible(int [] page, int nos, int mid) {
		int student = 1;
		int readpage = 0;
		for(int i = 0; i<page.length; ) {
			if(readpage + page[i] <=mid) {
				readpage+=page[i];
				i++;
			}
			else {
				student++;
				readpage = 0;
			}
			if(student > nos) {
				return false;
			}
		}
		return true;
	}

}
