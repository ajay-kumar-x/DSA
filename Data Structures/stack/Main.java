package stack;

public class Main {

	public static void main(String[] args) {
		Stack<Character> st=new Stack<Character>();
		st.push('a');
		st.push('b');
		st.push('c');
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.push('x');
		st.printStack();

	}

}
