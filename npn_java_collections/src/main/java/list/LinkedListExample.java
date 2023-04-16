package list;

import java.util.LinkedList;

public class LinkedListExample 
{
public static void main(String[] args) {
	LinkedList list  = new LinkedList();
	
	list.add("One");
	list.add("two");
	list.add("One");
	list.add(3);
	list.add(3);
	
	list.set(4, 4);
	
	System.out.println(list);
	
}
}
