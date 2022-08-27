package hashTable;

import java.util.ArrayList;
public class HashTable {
	private int size=7;
	private Node[] dataMap;
	
	class Node{
		String key;
		int value;
		Node next;
		Node(String key,int value){
			this.key=key;
			this.value=value;
		}
	}
	public HashTable() {
		dataMap=new Node[size];
	}
	
	
	public void printTable() {
		for(int i=0;i<dataMap.length;i++) {
			System.out.println(i+":");
			Node temp=dataMap[i];
			while(temp!=null) {
				System.out.println(" {"+temp.key+"= "+temp.value+"}");
				temp=temp.next;
			}
		}
	}
	
	
	//it will give the index(based on key) on which they key-value pair should be stored in hashtable
	public int hash(String key) {
		int hash=0;
		char[] keyChars=key.toCharArray();
		for(int i=0;i<keyChars.length;i++) {
			int asciivalue=keyChars[i];
			hash=(hash+asciivalue*23)%dataMap.length;
		}
		return hash;
	}
	
	public void put(String key,int value) {
		int index=hash(key);
		Node newNode=new Node(key,value);
		
		if(dataMap[index]==null)
			dataMap[index]=newNode;
		else {
			Node temp=dataMap[index];
			
			while(temp!=null) {
				
				if(temp.key==key) {
					temp.value=value;
					return;
				}
				if(temp.next==null)
					temp.next=newNode;
				temp=temp.next;
				
			}//while
		}//else
	}
	
	//get the value for the particular key
	public int get(String key) {
		int index=hash(key);
		Node temp=dataMap[index];
		while(temp!=null) {
			if(temp.key==key) return temp.value;
			temp=temp.next;
		}
		return -1;
	}
	
	
	//get all keys
	public ArrayList<String> keys() {
		ArrayList<String> keys=new ArrayList<String>();
		for(int i=0;i<dataMap.length;i++) {
			Node temp=dataMap[i];
			while(temp!=null) {
				keys.add(temp.key);
				temp=temp.next;
			}
		}
		return keys;
		
	}
	

}
