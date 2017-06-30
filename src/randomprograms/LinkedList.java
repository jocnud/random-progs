package randomprograms;

/**
 * 
 * @author shahbaz
 *
 */
public class LinkedList {

	public static void main(String[] args) {

		Node head = createLinkedList(1);

		addAtTheEnd(head, 31);
		addAtTheEnd(head, 15);
		addAtTheEnd(head, 17);
		head = addAtTheBegining(head, 0);
		head = addAtTheBegining(head, -51);
		addAtTheEnd(head, 92);
		addAtGivenPosition(head, 43, 2);

		print(head);

	}

	public static Node addAtGivenPosition(Node head, int data, int pos) {

		int count = 0;

		Node newNode = new Node();
		newNode.data = data;

		Node tNode = head;
		while (count < pos) {
			tNode = tNode.next;
			count++;
		}

		Node tempNode = tNode.next;
		tNode.next = newNode;

		newNode.next = tempNode;
		return head;
	}

	public static Node addAtTheBegining(Node head, int data) {

		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;

		return newNode;
	}

	public static Node addAtTheEnd(Node head, int data) {

		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;

		Node tNode = head;
		while (tNode.next != null) {
			tNode = tNode.next;
		}

		tNode.next = newNode;
		return head;
	}

	public static Node createLinkedList(int data) {
		Node headNode = new Node();
		headNode.data = data;
		headNode.next = null;

		return headNode;
	}

	public static void print(Node head) {
		Node tNode = head;
		while (tNode != null) {
			System.out.print(" |" + tNode.data + " |");
			tNode = tNode.next;
		}
		System.out.println();
	}

}

class Node {
	int data;
	Node next;

}
