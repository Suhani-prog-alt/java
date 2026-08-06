package recursion_42_q;

public class sum_of_alternatedigits_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q41. Sum of alternate digits 
//		Example: 
//		Input: 1234 
//		Output: 4 
		
		int n = 1234;
		int m = n;
		int len = 0;
		while(n>0) {
			len++;
			n/=10;
		}
		System.out.println(alternate_digit(m,len,0));
	}
	
	public static int alternate_digit(int n,int l,  int sum) {
		if(l == 0) {
			return sum;
		}
		if(l%2!=0) {
			sum+=n%10;
		}
		
		return alternate_digit(n/10, l-1, sum);
	}

}
