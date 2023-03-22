package src.LinkedList;
public class LinkList {

	Node head;
	private int size;

	LinkList() {
		size = 0;
	}

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
			size++;
		}
	}

//insertion atFirst and atLast
	public void addFirst(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

//insertion in atLast Position 
	public void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}

		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;

		}

		currNode.next = newNode;
	}

//print 
	public void printList() {
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + "->");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}

//Delete First
	public void deleteFirst() {

		if (head == null) {
			System.out.println("the list is empty");
			return;
		}
		size--;
		head = head.next;
	}

// delete last
	public void deleteLast() {
		if (head == null) {
			System.out.println("the list is empty");
			return;
		}
		size--;
		if (head.next == null) {
			head = null;
			return;
		}

		Node secondLast = head;
		Node lastNode = head.next;

		while (lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;

	}
	
	public void reverseIterate() {
		if(head == null || head.next == null) {
			return ;
		}
		Node prevNode = head;
		Node currentNode = head.next;
		while(currentNode != null) {
			Node nextNode = currentNode.next;
			currentNode.next = prevNode;
			
			//update
			prevNode = currentNode;
			currentNode = nextNode;
			
		}
		head.next = null;
		head = prevNode;
	}

	public Node reverseRecursive(Node head){
		if(head == null || head.next == null){
			return head;
		}
			Node newHead =  reverseRecursive(head.next);
			head.next.next = head;
			head.next = null;

			return newHead;
	}
	

	public int getSize() {
		return size;
	}

	public static void main(String[] args) {

		LinkList list = new LinkList();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.printList();

		list.head = list.reverseRecursive(list.head);
		list.printList();


	}


}
