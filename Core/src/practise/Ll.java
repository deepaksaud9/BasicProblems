package practise;

import java.util.LinkedList;

//linked List class Implementation
public class Ll {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("depp");
		list.add("roshan");
		list.add("pandey");
		list.add("saroj");
		list.add("ramesh");
		
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.size());
		list.remove(4);
		list.removeFirst();
		list.removeLast();
		
		System.out.println(list);
	}

}
