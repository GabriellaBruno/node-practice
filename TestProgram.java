/* 
 * Gabriella Bruno
 * Lab 5
 * Title: TestProgram.java
 * Description: nodes in different scenarios
 * Date: 9/24/25
 */
public class TestProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		//Q1: initial setup
		Node p = new Node('1', null);
		Node r = new Node('3', null);
		p.ref = new Node ('2', r);
		traverse(p);
		//Q1: final configuration
		p = p.ref;
		traverse(p);
		*/
		
		/*
		//Q2: initial setup
		Node p = new Node('1', null);
		Node q = new Node('2',null);
		Node r = new Node('3', null);
		p.ref = q;
		q.ref = r;
		traverse(p);
		//Q2: final configuration
		p = p.ref;
		traverse(p);
		*/
		
		/*
		//Q3: initial setup
		Node p = new Node('1', null);
		Node q = new Node('2', null);
		Node r = new Node('3', null);
		p.ref = q;
		q.ref = r;
		traverse(p);
		traverse(q);
		//Q3: final configuration
		q = p;
		traverse(p);
		traverse(q);
		*/
		
		/*
		//Q4: initial setup
		Node r = new Node('3', null);
		Node p = new Node('2', r);
		p = new Node ('1', p);
		traverse(p);
		traverse(r);
		//Q4: final configuration
		r = p.ref;
		traverse(p);
		traverse(r);
		*/
		
		/*
		//Q5: initial setup
		Node r = new Node('3', null);
		Node p = new Node('2', r);
		p = new Node ('1', p);
		traverse(p);
		//Q5: final configuration
		p.info = r.info;
		traverse(p);
		*/
		
		/*
		//Q6: initial setup
		Node r = new Node('3', null);
		Node p = new Node('2', r);
		p = new Node ('1', p);
		traverse(p);
		//Q6: final configuration
		p.info = p.ref.ref.info;
		traverse(p);
		*/
		
		/*
		//Q7: initial setup
		Node r = new Node('3', null);
		Node p = new Node('2', r);
		p = new Node ('1', p);
		traverse(p);
		//Q7: final configuration
		r.ref = p;
		traverse(p);
		*/
		
		/*
		//Q8: initial setup
		Node p = new Node('1', null);
		Node q = new Node('2', null);
		p.ref = q;
		p.ref.ref = new Node ('3', null);
		traverse(p);
		//Q8: final configuration
		q.ref.ref = p;
		traverse(p);
		*/
		
		/*
		//Q9: initial setup
		Node p = new Node('1', null);
		p.ref = new Node('2', null);
		p.ref.ref = new Node('3', null);
		traverse(p);
		//Q9: final configuration
		p.ref.ref.ref = p;
		traverse(p);
		*/
		
		/*
		//Q10: initial setup
		Node p = new Node('C', null);
		Node q = p;
		p = new Node('B', p);
		p = new Node('A', p);
		traverse(p);
		//Q10: final configuration
		p.ref = q;
		traverse(p);
		*/
		
		/*
		//Q11: initial setup
		Node p = new Node('A', null);
		p.ref = new Node('B', null);
		p.ref.ref = new Node('C', null);
		traverse(p);
		//Q11: final configuration
		p.ref = p.ref.ref;
		traverse(p);
		*/
		
		/*
		//Q12: initial setup
		Node p = new Node('D', null);
		p = new Node ('C', p);
		p = new Node ('B', p);
		p = new Node ('A', p);
		Node q =p;
		traverse(p);
		traverse(q);
		//Q12: final configuration
		while (q.ref != null) {
			q = q.ref;
		}
		traverse(q);
		*/
		
		/*
		//Q13: initial setup
		Node p = new Node('c', null);
		p = new Node ('c', p);
		p = new Node ('b', p);
		p = new Node ('a', p);
		Node q = p;
		traverse(p);
		traverse(q);
		//Q13: final configuration
		while (q.info != 'c' && q != null) {
			q = q.ref;
		}
		traverse(q);
		*/
		
		/*
		//Q14: initial setup
		Node p = null;
		traverse(p);
		//Q14: final configuration
		p = new Node('D', null);
		p = new Node ('C', p);
		p = new Node ('B', p);
		p = new Node ('A', p);
		traverse(p);
		*/
		
		/*
		//Q15: initial setup
		Node q = null;
		Node p = new Node('C', null);
		p = new Node('B', p);
		traverse(p);
		//Q15: final configuration
		p = new Node('A', p);
		traverse(p);
		*/
		
		/*
		//Q16: initial setup
		Node p = new Node('C', null);
		p = new Node ('B', p);
		p = new Node ('A', p);
		traverse(p);
		//Q16: final configuration
		p.ref.ref.ref = new Node('D', null);
		traverse(p);
		*/
		
		/*
		//Q17: initial setup
		Node q = null;
		Node p = new Node('C', null);
		p = new Node ('B', p);
		p = new Node ('A', p);
		traverse(q);
		traverse(p);
		//Q17: final configuration
		q = new Node(p.info, null);
		p = p.ref;
		p.ref.ref = q;
		q = null;
		traverse(q);
		traverse(p);
		*/
		
		/*
		//Q18: initial setup
		Node p = new Node('A', null);
		p.ref = new Node('B', null);
		p.ref.ref = new Node('C', null);
		traverse(p);
		//Q18: final configuration
		p.ref.ref.ref = new Node(p.info, null);
		p = p.ref;
		traverse(p);
		*/
		
	}//end main
	
	public static void traverse(Node head) {
		Node p = head;
		int counter = 0; //to prevent printing an endless loop
		
		while(p != null &&  counter < 10) {
			System.out.print("-->" + p.info);
			p = p.ref;
			counter++;
		}
		System.out.println();
	}
	
	
	
}//end class

/*
 * console output:
 * 
 * Question 1
-->1-->2-->3
-->2-->3
 * 
 * Question 2
-->1-->2-->3
-->2-->3
 * 
 * Question 3
-->1-->2-->3
-->2-->3
-->1-->2-->3
-->1-->2-->3
 * 
 * Question 4
-->1-->2-->3
-->3
-->1-->2-->3
-->2-->3
 * 
 * Question 5
-->1-->2-->3
-->3-->2-->3
 * 
 * Question 6
-->1-->2-->3
-->3-->2-->3
 * 
 * Question 7
-->1-->2-->3
-->1-->2-->3-->1-->2-->3-->1-->2-->3-->1
 * 
 * Question 8
-->1-->2-->3
-->1-->2-->3-->1-->2-->3-->1-->2-->3-->1
 * 
 * Question 9
-->1-->2-->3
-->1-->2-->3-->1-->2-->3-->1-->2-->3-->1
 * 
 * Question 10
-->A-->B-->C
-->A-->C
 * 
 * Question 11
-->A-->B-->C
-->A-->C 
 * 
 * Question 12
-->A-->B-->C-->D
-->A-->B-->C-->D
-->D
 * 
 * Question 13
-->a-->b-->c-->c
-->a-->b-->c-->c
-->c-->c
 * 
 * Question 14

-->A-->B-->C-->D
 * 
 * Question 15
-->B-->C
-->A-->B-->C
 * 
 * Question 16
-->A-->B-->C
-->A-->B-->C-->D
 * 
 * Question 17
 
-->A-->B-->C

-->B-->C-->A
 * 
 * Question 18
-->A-->B-->C
-->B-->C-->A
 * 
 */
