package lec15;

public class Wave_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12}
		};
		
//		for(int i = 0; i<arr[0].length; i++) {
//			for(int j = 0; j<arr.length; j++) {
//				System.out.print(arr[j][i]+" ");
//			}
//			i++;
//			if(i<arr[0].length) {
//				for(int j = arr.length -1; j>=0; j-- ) {
//					System.out.print(arr[j][i]+ " ");
//				}
//			}
//		}
		
//		if column even h toh up to down and if column odd h toh bottom to up
		
		for(int i = 0; i<arr[0].length; i++) {
			if(i%2==0) {
				for(int j = 0; j<arr.length ; j++) {
					System.out.print(arr[j][i] +" ");
				}
			}
			else {
				for(int j = arr.length -1 ; j>=0; j--) {
					System.out.print(arr[j][i]+" ");
				}
			}
		}
	}

}
