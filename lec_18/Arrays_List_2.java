package lec_18;
import java.util.*;
public class Arrays_List_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		System.out.println(ll.size());
		
		//Add
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(11);
		ll.add(2);
		ll.add(30);
		System.out.println(ll);
		
		for(int i = 0; i<ll.size(); i++) {
			System.out.println(ll.get(i)+" ");
		}
		System.out.println();
		
		int [] arr = new int [4];
		for(int x :arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		for(int x :ll) {
			System.out.print(x+" ");
		}
	}

}
