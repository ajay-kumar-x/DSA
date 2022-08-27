package stack;


public class Stack<T> {
	class Node{
		   T value;
		   Node next;
		   Node(T value){
			   this.value=value;
		   }
	   }
	private Node top;
	private int height;
	
	public void printStack() {
		   //System.out.println(getHead()+"-"+getTail()+", length:"+length);
		   Node temp=top;
		   while(temp!=null) {
			   System.out.println(temp.value+"");
			   temp=temp.next;
		   }
		  
	   }
	
	//push(value) O(1)  -same as prepend in LL
	public void push(T value) {
		 Node newNode=new Node(value);
		   if(height==0) {
			   top=newNode;
		   }
		   else {
		   newNode.next=top;
		   top=newNode;
		   }
		   height++;
	 }
	
	// Pop O(1) -same as removeFirst in LL
	   public Node pop() {
		   if(height==0) return null;
			Node temp=top;
			top=top.next;
			temp.next=null;
			height--;
			return temp;
	   }
}
