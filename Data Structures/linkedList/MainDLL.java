package linkedList;

public class MainDLL {

	public static void main(String[] args) {
		DLL<Integer> dll=new DLL<Integer>();
		//append
				dll.append(3);
				dll.append(2);
				dll.append(9);
				dll.append(5);
				dll.append(8);
				dll.printList();
				
				//System.out.println("length :"+dll.getLength());
				
				//removeLast
				System.out.println("removed last: "+dll.removeLast().value );
				dll.printList();
				
				//prepend
				dll.prepend(1);
				System.out.println("prepend 1");
				dll.printList();
				
				//removeFirst
				System.out.println("removed first: "+dll.removeFirst().value);
				dll.printList();
				
				
				//get(index)
				System.out.println("get item at index 1-> "+dll.get(1).value);
				
				//insert(index,value)
				System.out.println("inserting 9 at index 1 :"+dll.insert(1, 9));
				dll.printList();
				
				//set(index,value)
				System.out.println("Updating value at index 1 :"+dll.set(1, 23));
				dll.printList();

				//remove(index)
				System.out.println("removed at index 1: "+dll.remove(1).value);
				dll.printList();
	}

}
