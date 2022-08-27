package linkedList;

public class LL {
	 class Node{
		   int value;
		   Node next;
		   Node(int value){
			   this.value=value;
		   }
	   }
	private Node head;
	private Node tail;
	private int length;
	
	public int getHead() {
		return head.value;
	}

	public int getTail() {
		return tail.value;
	}

	public int getLength() {
		return length;
	}

	public LL(int value){
	 Node newNode=new Node(value);
	 head=newNode;
	 tail=newNode;
	 length=1;
	 
	}
  
   public void printList() {
	   //System.out.println(getHead()+"-"+getTail()+", length:"+length);
	   
	   Node temp=head;
	   while(temp!=null) {
		   System.out.print(temp.value+"->");
		   temp=temp.next;
	   }
	   System.out.println();
   }
   
   
   
   // Adding at Last O(1)
   public void append(int value) {
	   Node newNode=new Node(value);
	   if(length==0) {
		   head=newNode;
		   tail=newNode;
	   }
	   else {
	   tail.next=newNode;
	   tail=newNode;
	   }
	   length++;
   }
   
   // Removing Last O(n)
   public Node removeLast() {
	   if(length==0) return null;
	   
	   Node pre=head,temp=head;
	   while(temp.next!=null) {
		   pre=temp;
		   temp=temp.next;
		   
	   }
	   tail=pre;
	   tail.next=null;
	   length--;
	   if(length==0) {head=null;tail=null;}
	   return temp;
	   
   }
   
   
   
   // Adding at First O(1)
   public void prepend(int value) {
	   Node newNode=new Node(value);
	   if(length==0)
	   {
		   head=newNode;
		   tail=newNode;
	   }else {
		  newNode.next=head;
		  head=newNode;
		   
	   }
	   length++;   
   }
   
   // Removing First O(1)
   public Node removeFirst() {
	   if(length==0) return null;// if(head==null)
	   Node temp=head;
	   head=head.next;
	   
	   length--;
	   if(length==0){head=null;tail=null;}
	   return temp; 
   }
   
   public Node get(int index) {
	  if(index<0 || index>=length) return null;
	   
	   Node tem=head;
	   for(int i=0;i<index;i++) {
		   tem=tem.next;
	   }
	   return tem;
   }
   
   public boolean insert(int index,int value) {
	
	   if(index<0 || index>length) return false;
	   if(index==0) {
		   prepend(value); return true;
	   }
	   if(index==length) {
		   append(value); return true;
	   }
	   /*
	   Node tem=head;
	   Node newNode=new Node(value);
	   for(int i=0;i<index-1;i++) {
		   tem=tem.next;
	   }
	   newNode.next=tem.next;
	    tem.next=newNode;

	    also for 128-135 */
	    Node newNode=new Node(value);
	    Node tem=get(index-1);
	    newNode.next=tem.next;
	    tem.next=newNode;
	    
	   length++;
	   return true;  
   }
   
   public boolean set(int index,int value) {
//	   if(index<0 || index>=length) return false;
//	   Node tem=head;
//	   for(int i=0;i<index;i++) {
//		   tem=tem.next;
//	   }
//	   tem.value=value;
//	  
//	   return true;
	   
	    Node tem=get(index);
	    if(tem!=null){
	    tem.value=value;
	    return true;
	    }
	    return false;   
	   
   }
   
   public Node remove(int index) {
		
	   if(index<0 || index>=length) return null;
	   if(index==0)   return removeFirst();
	   if(index==length-1) return removeLast();
	   
	   
	   Node pre=get(index-1);
	   Node tem=pre.next;
	   pre.next=tem.next;
	   tem.next=null;
	    
	   length--;
	   return tem;  
   }
   
   public void reverse() {
	   Node tem=head;
	   head=tail;
	   tail=tem;
	   Node before=null,after=null;
	   for(int i=0;i<length;i++) {
		   after=tem.next;
		   tem.next=before;
		   before=tem;
		   tem=after;
	   }
   }
   
   
}
