package test.nets.a1;

public class NodeList {
		
	public boolean findValue(Node head, int k) {
		if (head == null)
			return false;
		else
			if (k == head.value)
				return true;
			else
				return findValue(head.next, head.value);
	}
	
	public void print(Node head) {
		if (head == null) {
			System.out.println("Print: empty list");
			return;
		}

		if (head.next == null) {
			System.out.println("Print: " + head.value);
			return;
		}
		else {
			// printing head
			System.out.println("Print: " + head.value);

			// iterating over all next nodes
			Node p = head.next;

			while (p != null) {
				System.out.println("Print: " + p.value);
				p = p.next;
			}
		}
	}
}
