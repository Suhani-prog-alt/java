package lec_18;
import java.util.*;
public class Arrays_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		System.out.println(ll.size());
		
		// add
		ll.add(10);  // T.C. - O(1)
		ll.add(20);
		ll.add(30);
		System.out.println(ll);
		
//		ll.add(Index, Value)
		ll.add(1,-7);  // T.C. - O(n)
		System.out.println(ll);
		
		//get  // o(1)
		System.out.println(ll.get(2));
		
		// remove   // O(n)
		System.out.println(ll.remove(0));
		
		//update
		ll.set(1,110);  // O(n)
		System.out.println(ll);
		
		//sort
		Collections.sort(ll);  // n(log n)
		System.out.println(ll);
		
		
	}

}
