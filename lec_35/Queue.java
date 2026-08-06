package lec_35;

public class Queue {
	private int [] arr;
	private int front;
	private int size;

	
	// Linear Queue
	public Queue(){
		this(5);
	}
	
	public Queue(int n) {
		arr = new int [n];
	}
	// 0(1)
	public boolean isempty() {
		return size==0;
	}
	
	//0(1)
	public boolean isfull() {
		return size==arr.length;
	}
	
	//0(1)
	public int size() {
		return size;
	}
	
	//0(1)
	public void Enqueue(int x) throws Exception{
		if(isfull()) {
			throw new Exception("Bklol Queue full hai");
		}
		int idx = (front+size)% arr.length;
		arr[idx] = x;
		size++;
	}
	
	public int Dequeue() throws Exception{
		if(isempty()) {
			throw new Exception("Bklol Queue Empty hai");
		}
		int x = arr[front];
		front = (front+1)%arr.length;
		size--;
		return x;
	}
	
	public int GetFront() throws Exception{
		if(isempty()) {
			throw new Exception("Bklol Queue Empty hai");
		}
		int x = arr[front];
		return x;
	}
	
	public void Display() {
		for(int i = 0; i<size; i++) {
			int idx = (front+i)%arr.length;
			System.out.print(arr[idx]+" ");
		}
		System.out.println();
	}
	
}
