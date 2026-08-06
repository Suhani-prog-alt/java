package lec_36;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		P obj = new P();
////		obj.
//		
//		C obj1 = new C();
////		obj1.
///

		
//		Case 1----------------------------------
//		P obj = new P();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		obj.fun();
//		obj.fun1();
	
		
		
		
//		Case 2----------------------------
//		run time pr P or C dono access ho rha h, but C compile time pr access nhi h
		
//		P obj = new C();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(obj.d2);
//		System.out.println(((C)obj).d2);
//		
//		//run time polymorphism - method overriding ( run time m, phle child m check krta h)
//		obj.fun();
//		obj.fun1();
//		((C)obj).fun2();
		
		
		
		
//		Case 3 ---------------------------------(this is impossible)
//		C obj = new P();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(obj.d2);
		
		
		
//		Case 4--------------------
//		C obj = new C();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(obj.d2);
//		System.out.println(((P)obj).d);
		
		
//		------------------------------------
//		 a child cannot have 2 parents, it is possible only due to interface
	}

}
