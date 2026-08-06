package assignment_3;
import java.util.*;
public class Sort_just_Zeroes_and_Ones {
	
//	Sort just 0 and 1
//
//
//	Input Format
//	A line containing N number of 0s and 1s Next line follows a long sequence of 0 and 1 seperated by space
//
//
//	Constraints
//	N will not exceed 10^7
//
//
//	Output Format
//	Sorted Sequence
//
//
//	Sample Input
//	7
//	1 0 0 1 1 0 1
//	Sample Output
//	0 0 0 1 1 1 1
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
        int  n = sc.nextInt();
        int count_0 = 0;
        int [] arr = new int [n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 0){
                count_0++;
            }
        }

        for(int i = 0; i<count_0; i++){
            System.out.print("0"+" ");
        }
        for(int i = 0 ; i<n-count_0 ;i++){
            System.out.print("1"+" ");
        }
	}

}
