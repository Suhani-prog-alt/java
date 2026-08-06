package lec_31;

public class Sieve_of_Eratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 120;
	}
	
	public static int Prime_Sieve(int n) {
		if(n<=2) return 0;
		int [] prime = new int [n+1];
		prime[0] = prime[1] = 1;		// 0 and 1 is not prime number
		for(int i = 2; i*i <= prime.length; i++	){
			if( prime[i] == 0) {
				for(int j =2; i*j< prime.length; j++) {
					prime[i*j] = 1;
				}
			}
		}
		int count = 0;
		for(int i = 2; i<prime.length; i++) {
			if(prime[i] == 0) {
				count++;
			}
		}
	}

}
