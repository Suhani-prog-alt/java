package 
lec10;

public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,3,4,5,6,9,2};
		System.out.println();
		
		Sort(arr);
	}
	
	public static void Sort(int [] arr) {
		for(int i = 1; i<arr.length; i++) {
			Insert_Last_Element(arr,i);
		}
	}
	
	public static void Insert_Last_Element(int [] arr, int i) { // i is the last elememnt
		int item = arr[i];
		int j = i-1;
		while(j>=0 && arr[j]> item) {
			arr[j+1] = arr [j];
			arr[j] = item;
			j--;
		}
		// j+1 correct index
	}

}
