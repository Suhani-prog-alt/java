package recursion_42_q;

public class dec_bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q28. Decimal to binary 
//		Example: 
//		Input: 5 
//		Output: 101 
		
		int n = 5;
		System.out.println(Dec_Bin(n, 0, 1));
	}
	
	public static int Dec_Bin(int n, int bin, int mul) {
		if(n == 0) {
			return bin;
		}
		
		int rem = n%2;
		bin = bin + rem*mul;
		mul*=10;
		
		return Dec_Bin(n/2, bin, mul);
	}

}
