package test.nets.a1;


public class NodeListMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		NodeList nodeList = new NodeList();
		// n5->n4->n3->n2->n1
		Node n1 = new Node(1, null);
		Node n2 = new Node(2, n1);
		Node n3 = new Node(3, n2);
		Node n4 = new Node(4, n3);
		Node n5 = new Node(5, n4);
		
		// printing out before copy method
		System.out.println("NodeListMain: printing nodes 1-5");
		nodeList.print(n5);
		System.out.println();
		
		// testing the find function
		System.out.println("NodeListMain: trying to find values 1-5 in original");
		for (int i = 5; i > 0; i--)
			if (nodeList.findValue(n5, i))
				System.out.println("-> found '" + i + "'");
			else
				System.out.println("-> did *NOT* find '" + i + "'");
	}
}
