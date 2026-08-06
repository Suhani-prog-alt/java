package lec8;

public class Array_max_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {200,34,45,5,6,7,897,4,3};
		System.out.println(Maximum_Value1(arr));
		System.out.println(Maximum_Value2(arr));
	}
	
	public static int Maximum_Value2(int [] arr) {
		int Max = Integer.MIN_VALUE; //   -21^31
		for(int i = 0; i<arr.length; i++) {
			if(Max < arr[i]) {
				Max = Math.max(Max, arr[i]); // give max of two numbers
			}
		}
		return Max;
	}
	
	public static int Maximum_Value1(int [] arr) {
		int Max = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(Max < arr[i]) {
				Max = arr[i];
			}
		}
		return Max;
	}

}
