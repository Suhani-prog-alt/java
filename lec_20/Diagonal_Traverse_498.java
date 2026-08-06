package lec_20;

import java.util.Collections;
import java.util.*;

public class Diagonal_Traverse_498 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int [] findDiagonalOrder(int [][] arr) {
		int row = arr.length;
		int col = arr[0].length;
		int [] ans = new int[row*col];
		int idx = 0;
		for(int d= 0; d<row+col-1; d++) {
			int r,c;
			if(d<col) {
				r = 0;
				c = d;
			}else {
				r = d-col+1;
				c = col-1;
			}
			ArrayList<Integre> ll = new ArrayList<Integer>();
			while(r<arr.length && c>=0) {
				// arr[r][c] --> add or paint
				ll.add(arr[r][c]);
				r++;
				c--;
			}
			if(d%2!=0) {
				for(int ele : ll) {
					ans[idx] = ele;
					idx++;
				}
			}
			else {
				Collections.reverse(ll);
				for(int ele : ll) {
					ans[idx] = ele;
					idx++;
				}
			}
		}
		return ans;
	}

}
