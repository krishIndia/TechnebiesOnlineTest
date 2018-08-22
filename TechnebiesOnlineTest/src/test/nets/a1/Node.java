package test.nets.a1;

public class Node {

	public int value;

	public Node next;

	Node() {
		this.value = Integer.MAX_VALUE;
		this.next = null;
	}

	public Node(int value, Node next) {
		this.value = value;
		this.next = next;
	}
}
