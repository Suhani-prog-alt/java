package lec_29;

public class Combination_sum_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Combination(coin, amount, ll, 0, ans);
		System.out.println(ans);

	}
	public static void Permutation(int [] coin, int amount,List<Integer> ll, int idx, List<List<Integer>> ans) {
		if(amount == 0) {
//			System.out.println(ans);
			ans.add(new ArrayList<>(ll));
			return;
		}
		
		for(int i = idx; i<coin.length; i++) {
			if(amount >= coin [i]) {
				ll.add(coin[i]);
				Permutation(coin, amount - coin[i],ll, i, ans);
				ll.remove(ll.size()-1);
			}
		}
	}

}
