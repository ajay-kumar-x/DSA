package linkedList;

import linkedList.LL.Node;

public class DLL<T>{
	
	class Node{
		    T value;
		   Node prev;
		   Node next;
		   Node(T value){
			   this.value=value;
		   }
	   }
	
	private Node head;
	private Node tail;
	private int length;
	
	public void printList() {
		   //System.out.println(getHead()+"-"+getTail()+", length:"+length);
		   Node temp=head;
		   while(temp!=null) {
			   System.out.print(temp.value+"<->");
			   temp=temp.next;
		   }
		   System.out.println();
	   }
	
	//append-> adding at last O(1)
	public void append(T value) {
		 Node newNode=new Node(value);
		   if(length==0) {
			   head=newNode;
			   tail=newNode;
		   }
		   else {
		   tail.next=newNode;
		   newNode.prev=tail;
		   tail=newNode;
		   }
		   length++;
	 }
	
	//Adding at first  O(1)
	public void prepend(T value) {
		 Node newNode=new Node(value);
		   if(length==0)
		   {
			   head=newNode;
			   tail=newNode;
		   }else {
			  newNode.next=head;
			  head.prev=newNode;
			  head=newNode;
		   }
		   length++; 
	}
	
	//rempove the first element O(1)
	public Node removeFirst() {
		if(length==0) return null;
		Node temp=head;
		if(length==1) {
			head=null;
			tail=null;
		}
		else {
			head=head.next;
			head.prev=null;
			temp.next=null;
		}
		length--;
		return temp;
	}
	
	//remove the last element O(1)
	public Node removeLast() {
		if(length==0) return null;
		
		Node temp=tail;
		
		if(length==1) {
			head=null;
			tail=null;
		}
		else {
			tail=tail.prev;
			tail.next=null;
			temp.prev=null;
		}
		length--;
		return temp;
	}
	
	//get(index)
	public Node get(int index) {
		if(index<0 || index>=length) return null;
		Node temp=head;
		if(index<length/2) {
			for(int i=0;i<index;i++)
				temp=temp.next;
		}
		else {
			temp=tail;
			for(int i=length-1;i>index;i--)
				temp=temp.prev;
		}
		return temp;
	}
	
	//set(index,value)
     public boolean set(int index,T value) {
    	 Node temp=get(index);
    	 if(temp!=null) {
    		 temp.value=value;
    		 return true;
    	 }
    	 return false;
     }
     
     
     public boolean insert(int index,T value) {
    		
  	   if(index<0 || index>length) return false;
  	   if(index==0) {
  		   prepend(value); return true;
  	   }
  	   if(index==length) {
  		   append(value); return true;
  	   }
  
  	    Node newNode=new Node(value);
  	    Node before=get(index-1);
  	    Node after=before.next;
  	    
  	    newNode.prev=before;
  	    newNode.next=after;
  	    before.next=newNode;
  	    after.prev=newNode;
  	    
  	   length++;
  	   return true;  
     }
     
     
     public Node remove(int index) {
 		
  	   if(index<0 || index>=length) return null;
  	   if(index==0)   return removeFirst();
  	   if(index==length-1) return removeLast();
  	   
  	   
  	   Node temp=get(index);
  	   temp.next.prev=temp.prev;
  	   temp.prev.next=temp.next;
  	   
  	   temp.next=null;
  	   temp.prev=null;
  	    
  	   length--;
  	   return temp;  
     }
	
	
	
}
