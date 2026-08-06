package lec_18;

public class Wrapper_class_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a1 = 10;
		int a = 10;
		
		Integer b = a; // Auto-boxing  (Primitive to non-primitive)
		int x = a1; // Un-boxing		(Non-primitive to Primitive)
		
		Integer c1 = 19;
		Integer c2 = 19;
		Integer c3 = 191;
		Integer c4 = 191;
		System.out.println(c1==c2);	//true due to range(-128 to 127)
		System.out.println(c3==c4);	// false
		
		Boolean b1 = false;
		Boolean b2 = false;
		System.out.println(b1==b2);  // no new address will form for same data
		
		Character ch1 = 'Z';
		Character ch2 = 'Z';
		System.out.println(ch1==ch2); // no new address will form for same data
	}

}
