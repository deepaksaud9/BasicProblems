package LinkedList;

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
			 System.out.println("Null");
		}
	
	
	public static void main(String[] args) {
		LL list = new LL();
		list.addFirst("a");
		list.addFirst("is");
		list.addLast("java");
		list.addLast("programming");
		list.printList();
	}

}
