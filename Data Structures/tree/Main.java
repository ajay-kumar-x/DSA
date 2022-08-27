package tree;

import java.util.Hashtable;

public class Main {

	public static void main(String[] args) {
		BST bst=new BST();
		bst.insert(46);
		bst.insert(76);
		bst.insert(52);
		bst.insert(21);
		bst.insert(82);
		bst.insert(18);
		System.out.println(bst.root.right);
		System.out.println(bst.contains(81));
		
		
		
		System.out.println(bst.BFS());
		System.out.println(bst.DFSPreOrder());
		System.out.println(bst.DFSPostOrder());
		System.out.println(bst.DFSInorder());
		

	}

}
