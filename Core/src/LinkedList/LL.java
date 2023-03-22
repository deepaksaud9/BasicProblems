package src.LinkedList;

public class LL {
	Node head;
	private int size;
	
	LL (){
		size = 0;
	}
	
	class Node{
		String data;
		Node next;
		Node(String data){
			this.data = data;
			this.next = null;
			size++;
		}
	}
	

	
	
	//insertion atFirst and atLast
	public void addFirst(String data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode; 
	}
		
	//insertion in atLast Position 
		public void addLast(String data) {
			Node newNode = new Node(data);
			if(head == null) {
				head = newNode;
				return;
			}
			
			Node currNode = head;	
			 while(currNode.next != null){
				 currNode = currNode.next;
				 
			 }
			 
			 currNode.next = newNode;
		}
		
		
		//print 
		public void printList() {
			Node currNode = head;	
			 while(currNode != null){
				 System.out.print(currNode.data+"->");
				 currNode = currNode.next;	 
			 }
			 System.out.println("NULL");
		}
		


		
//Delete First
	public void deleteFirst() {
		
		if(head == null) {
			System.out.println("the list is empty");
			return;
		}
		size--;
		head = head.next;
	}
	
	
	
// delete last
	public void deleteLast() {
	if(head == null) {
		System.out.println("the list is empty");
		return;
	}
	size--;
	if(head.next==null) {
		head=null;
		return;
	}
	
	Node secondLast = head;
	Node lastNode = head.next;
	
	while(lastNode.next != null) {
		lastNode = lastNode.next;
		secondLast = secondLast.next;
	}
	secondLast.next = null;
	
	}
	
	
	public int getSize() {
		return size; 
	}
	
//main method
	public static void main(String[] args) {
		LL list = new LL();
		list.addFirst("we");
		list.addFirst("are");
		list.addLast("java");
		list.addLast("programmer");
		list.addFirst("Here");
		list.printList();
		list.deleteFirst();
		
		list.deleteLast();
		list.printList();
		list.getSize();
		System.out.println(list.getSize());
	}

}
