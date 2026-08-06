package lec_35;

public class Queue_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.Enqueue(10);
		q.Enqueue(10);
		q.Enqueue(10);
		q.Enqueue(10);
		q.Enqueue(10);
		q.Enqueue(10);
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
		q.Enqueue(60);
		q.Display();
		
	}

}
