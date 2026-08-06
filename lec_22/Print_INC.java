package lec_22;

public class Print_INC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		PD(n);
	}
	
	public static void PD(int n) {
		if(n == 0) {
			return;
		}
		PD(n-1);
		System.out.println(n);
		
	}

}
