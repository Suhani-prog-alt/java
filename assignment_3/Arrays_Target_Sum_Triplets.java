package assignment_3;

public class Arrays_Target_Sum_Triplets {
	
//	Take as input N, the size of array. Take N more inputs and store that in an array. Take as input “target”, a number. Write a function which prints all triplets of numbers which sum to target.
//
//
//	Input Format
//	First line contains input N.
//	Next line contains N space separated integers denoting the elements of the array.
//	The third line contains a single integer T denoting the target element.
//
//
//	Constraints
//	Length of Array should be between 1 and 1000.
//
//
//	Output Format
//	Print all the triplet present in the array in a new line each. The triplets must be printed as A, B and C where A,B and C are the elements of the triplet ( A<=B<=C) and all triplets must be printed in sorted order. Print only unique triplets.
//
//
//	Sample Input
//	9
//	5 7 9 1 2 4 6 8 3
//	10
//	Sample Output
//	1, 2 and 7
//	1, 3 and 6
//	1, 4 and 5
//	2, 3 and 5
//	Explanation
//	Array = {5, 7, 9, 1, 2, 4, 6 ,8 ,3}. Target number = 10. Find any three number in the given array which sum to target number.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];

        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int final_sum = sc.nextInt();

        // System.out.println(final_sum);
        Triple_Sum(arr, final_sum);

	}
	
	public static void Sort(int [] arr) {
		for (int turn = 1; turn<arr.length; turn++) {
			for(int i = 0; i< arr.length - turn;i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i]= arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
	}
	
	public static void Triple_Sum(int [] arr, int total_sum){
        int [] sort_arr = new int [3];
        Sort(arr);

        for (int i = 0; i<arr.length - 2; i++){
            for(int j = i+1; j<arr.length -1; j++){
                if(arr[i] + arr[j] < total_sum){
                    sort_arr[0] = arr[i];
                    sort_arr[1] = arr[j];
                    for(int k = j+1; k<arr.length ; k++){
                        if((arr[i] + arr[j] + arr[k]) == total_sum){
                            sort_arr[2] = arr[k];
                            System.out.println(sort_arr[0]+", "+sort_arr[1]+" and "+sort_arr[2]);
                        }
                    }
                }
            }
        }
	}

}
