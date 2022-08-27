package hashTable;

public class Main {

	public static void main(String[] args) {
		HashTable ht=new HashTable();
		ht.put("apple", 140);
		ht.put("apple", 3);
		ht.put("banana", 200);
		ht.put("mango", 100);
		ht.put("cherry", 50);
		ht.put("berry", 40);
		ht.printTable();
		
		System.out.println(ht.get("banana"));
		System.out.println(ht.get("mango"));
		System.out.println(ht.keys());

	}

}
