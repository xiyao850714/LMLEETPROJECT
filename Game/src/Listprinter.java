
import java.util.Stack;

public class Listprinter {
	public static void printList(Node<Integer> n){
		Stack<Integer> st = new Stack<Integer>();
		while(n != null){
			st.push(n.data);
			n = n.next;
		}
		while(st.peek() != null)
			System.out.print(st.pop());
	}
	public static void main(String[] args) {
		Node<Integer> mn3 = new Node<Integer>(4,null);
		Node<Integer> mn2 = new Node<Integer>(7,mn3);
		Node<Integer> mn1 = new Node<Integer>(1,mn2);
        Listprinter.printList(mn1);
 
	}
}
