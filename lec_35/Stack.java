package lec_35;

public class Stack {
	
	private int [] arr;
	private int idx = -1;
	
	public Stack() {
		this(5);
	}
	
	public Stack(int n) {
		arr = new int [n];
	}
	
	// 0(1)
	public boolean IsEmpty() {
		return idx == -1;
	}
	
	// 0(1)
	public int Size() {
		return idx+1;
	}

	public void Display() {
		for(int i = 0; i<=idx; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public boolean Isfull() {
		return Size() == arr.length;
	}
	
	public void Push(int x) throws Exception{
		if(Isfull()) {
			throw new Exception("Bklol tera Stack kb ka full ho gya h");
		}
		arr[++idx] = x;
	}
	
	public int Pop() throws Exception{
		if(IsEmpty()) {
			throw new Exception("BKlol tera stack kb ka empty h");
		}
		return arr[idx--];
	}
	
	public int Peek() throws Exception{
		if(IsEmpty()) {
			throw new Exception("BKlol tera stack kb ka empty h");
		}
		return arr[idx];
	}

}
