package recursion_42_q;

public class count_even_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q19. Count even numbers 
//		Example: 
//		Input: [1, 2, 4] 
//		Output: 2 
		
		int [] arr = {1,2,4};
		System.out.println(count(arr, 0, 0));
	}
	
	public static int count(int [] arr, int i, int c) {
		if(i == arr.length) {
			return c;
		}
		if(arr[i]%2==0) {
			c++;
		}
		return count(arr, i+1, c);
	}

}
