package tree;

import java.util.*;

public class BST{

	 Node root;
	class Node{
		int value;
		Node left;
		Node right;
		private Node(int value) {
			this.value=value;
		}
	}
	
	//insert
	public boolean insert(int value) {
		
		Node newNode=new Node(value);
		if(root==null) {
			root=newNode;
			return true;
		}
		Node temp=root;
		while(true) {
			if(newNode.value==temp.value) return false;
			
			if(newNode.value<temp.value) {
				if(temp.left==null) {
					temp.left=newNode;
					return true;
				}
				temp=temp.left;
			}
			else {
				if(temp.right==null) {
					temp.right=newNode;
					return true;
				}
				temp=temp.right;
			}
		}//while
		
	}
	
	
	//contains(value)
	public boolean contains(int value) {
		Node temp=root;
		while(temp!=null) {
			if(value<temp.value)
				temp=temp.left;
			else if(value>temp.value)
				temp=temp.right;
			else
				return true;
		}//while
		return false;
	}
	
	
	
	
	
	
	
	
	
	//............TREE TRAVERSAL...................
	//BFS
	public ArrayList<Integer> BFS(){
		if(root==null)
			return null;
		Node current=root;
	
		Queue<Node> queue=new LinkedList<>();
		ArrayList<Integer> res=new ArrayList<>();
		queue.add(current);
		while(queue.size()>0) {
			current=queue.poll();
			res.add(current.value);
			if(current.left!=null)
				queue.add(current.left);
			if(current.right!=null)
				queue.add(current.right);
		}
		return res;
	}
	
	
	
	
	//DFS   
	
	//preorder
	public ArrayList<Integer> DFSPreOrder(){
	 ArrayList<Integer> result=new ArrayList<>();
	 class Traverse{
		 Traverse(Node current){
			 result.add(current.value);
			 if(current.left!=null) {
				 new Traverse(current.left);
			 }
			 if(current.right!=null) {
				 new Traverse(current.right);
			 }
		 }
	 }
	 new Traverse(root);
	 return result;
	}
	
	//postorder
	public ArrayList<Integer> DFSPostOrder(){
		 ArrayList<Integer> result=new ArrayList<>();
		 class Traverse{
			 Traverse(Node current){
				 
				 if(current.left!=null) {
					 new Traverse(current.left);
				 }
				 if(current.right!=null) {
					 new Traverse(current.right);
				 }
				 result.add(current.value);
			 }
		 }
		 new Traverse(root);
		 return result;
		}
	
	
	//inorder
	public ArrayList<Integer> DFSInorder(){
		 ArrayList<Integer> result=new ArrayList<>();
		 class Traverse{
			 Traverse(Node current){
				
				 if(current.left!=null) {
					 new Traverse(current.left);
				 }
				 result.add(current.value);
				 if(current.right!=null) {
					 new Traverse(current.right);
				 }
			 }
		 }
		 new Traverse(root);
		 return result;
		
		}
	
	
	
}
