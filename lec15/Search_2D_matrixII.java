package lec15;

public class Search_2D_matrixII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int [][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		System.out.print(searchMatrix(matrix, 30));
		
	}
	
	// this method is from top right corner
	public static boolean searchMatrix(int [][] matrix, int target) {
		int row = 0;
		int col = matrix[0].length -1;
		while(row < matrix.length && col >=0) {
			if(matrix[row][col] == target) {
				return true;
			}
			else if( matrix[row][col] > target) {
				col--;
			}
			else {
				row++;
			}
		}
		return false;
	}

}
