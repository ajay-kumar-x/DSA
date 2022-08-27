package queue;


public class Queue<T> {
	class Node{
		   T value;
		   Node next;
		   Node(T value){
			   this.value=value;
		   }
	   }
	private Node first;
	private Node last;
	private int length;
	
	public void printQueue() {
		   //System.out.println(getHead()+"-"+getTail()+", length:"+length);
		   Node temp=first;
		   while(temp!=null) {
			   System.out.print(temp.value+"<-");
			   temp=temp.next;
		   }
		   System.out.println();
		  
	   }
	
	//enqueue(value) O(1)  -same as append in LL
	public void enqueue(T value) {
		 Node newNode=new Node(value);
		   if(length==0) {
			   first=newNode;
			   last=newNode;
		   }
		   else {
		   last.next=newNode;
		   last=newNode;
		   }
		   length++;
	 }
	
	// dequeue O(1) -same as removeFirst in LL
	   public Node dequeue() {
		   if(length==0) return null;
			Node temp=first;
			first=first.next;
			temp.next=null;
			length--;
			return temp;
	   }

}
