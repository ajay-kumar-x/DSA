package linkedList;

public class MainLL {

	public static void main(String[] args) {
		LL ll=new LL(6);
		
		//append
		ll.append(3);
		ll.append(2);
		ll.append(9);
		ll.append(5);
		ll.append(8);
		ll.printList();
		
		System.out.println("length :"+ll.getLength());
		
		//removeLast
		System.out.println("removed last: "+ll.removeLast().value );
		ll.printList();
		
		//prepend
		ll.prepend(1);
		System.out.println("prepend 1");
		ll.printList();
		
		//removeFirst
		System.out.println("removed first: "+ll.removeFirst().value);
		ll.printList();
		
		
		//get(index)
		System.out.println("get item at index 1-> "+ll.get(1).value);
		
		//insert(index,value)
		System.out.println("inserting 9 at index 1 :"+ll.insert(1, 9));
		ll.printList();
		
		//set(index,value)
		System.out.println("Updating value at index 1 :"+ll.set(1, 23));
		ll.printList();

		//remove(index)
		System.out.println("removed at index 1: "+ll.remove(1).value);
		ll.printList();
		
		//reverse()
		ll.reverse();
		ll.printList();

	}

}
