package queue;

public class Main {

	public static void main(String[] args) {
		Queue<Integer> que=new Queue<Integer>();
		que.enqueue(2);
		que.enqueue(3);
		que.enqueue(7);
		que.printQueue();
		que.dequeue();
		que.printQueue();

	}

}
