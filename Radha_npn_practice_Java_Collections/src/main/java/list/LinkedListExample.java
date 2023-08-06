package list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample 
{
	static LinkedList list2 = new LinkedList();
	static LinkedList list1 = new LinkedList();
	
	public static void main(String[] args) 
	{
		//check for storing different data-types
		//check for adding at an index in between existing elements
		//check to add at an index out of range
		//check to add duplicates
		//check to append a collection to another - addAll and the return status of addAll
		//check clear method
		//check get method for different datatypes stored and check the returning object
		//check set method behaviour and the old value it returns
		//check indexOf and returned value
		//check indexOf for duplicate value
		//check indexOf for non-existent value
		//check add - to an existing index
		//check set - to an existing index
		//check remove(),remove(int),remove(Object)
		
		
		list2.add("a");
		list2.add(1, 4.5);
		list2.add(1, 6);
		list2.add("a");
		list2.add("z");
		list2.add("k");
		//Object oldValue = list2.set(3, "b");
		//System.out.println("set of <index> returned old value is: "+oldValue);
		//list2.remove();
		//list2.remove(5);
		//list2.remove("a");
		//list2.remove("b");

		
		
		
		list1.add(0);
		list1.add(1, "dog");
		Boolean changed = list1.addAll(list2);
		System.out.println("whether list was changed after appending?  "+changed);
		
		
		
		
		printCollection();
		printSize();
		
	}
	public static void printCollection()
	{
		System.out.println("List2:  "+list2);
		System.out.println("List1:  "+list1);
	}

	public static void printSize()
	{
		System.out.println("Size of list 2:  "+list2.size());
		System.out.println("Size of list 1:  "+list1.size());
	}

}
