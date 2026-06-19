/* 
 * Gabriella Bruno
 * Lab 5
 * Title: Node.java
 * Description: creates node class
 * Date: 9/24/25
 */
public class Node {
	
	char info;
	Node ref;
	
	public Node(char letter, Node next){
		info = letter;
		ref = next;
	}

}//end class
