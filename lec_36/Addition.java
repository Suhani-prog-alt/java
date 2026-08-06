package lec_36;

public class Addition {
//	Overloadding 
//	compile time polymorphism - same class m hota h, isme sirf ye sb differ hoga no. of arguments or type of argument or implementation
//	but in this, return type and name of class same rhta h.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(2,7));
		System.out.println(add(2,7, 9));
		System.out.println(add(2,7, 19.9));
		System.out.println(add(2,7, 19, 4,4,5,6,7,3,0,1,34));
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public static int add(int a, int b, double c) {
		return (int)(a+b+c);
	}
	
	
//	ye isko array m convert kr deta h
//	... a -> It forms a array which can hold any number of elements
	public static int add(int x,int... a) {
		int sum = 0;
		for(int i = 0; i<a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}

}
