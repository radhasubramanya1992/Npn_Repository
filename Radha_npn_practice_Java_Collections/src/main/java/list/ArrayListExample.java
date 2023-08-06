package list;

import java.util.ArrayList;

public class ArrayListExample 
{
	static ArrayList list1 = new ArrayList();
	static ArrayList list2 = new ArrayList();
	
public static void main(String[] args) 
{
	//check for storing different data-types
	//check for adding at an index in between existing elements
	//check add - to an existing index
	//check to add at an index out of range
	//check to add duplicates
	//check to append a collection to another - addAll and the return status of addAll
	
	//check get method for different datatypes stored and check the returning object
	
	//check set method behavior and the old value it returns
	//check set - to an existing index
	
	//check indexOf - existing and  non-existent value
	//check indexOf for duplicate value

	//check clear method
	//check removeAll(),remove(int),remove(Object)
	
	
	list2.add("hi hello");
	list2.add(0, "q");
	list2.add(3);
	list2.add(3);
	int i = list2.indexOf("a");
	System.out.println("first occurance exists in index:  "+i);
	//list2.clear();
	Object b = list2.get(2);
	System.out.println("get of <index>returned:  "+b);
	//Object x = list2.set(2, 4);
	//System.out.println("set of <index> returned old value is:  "+x);
		
	
	list1.add(5);
	list1.add(1, "hi");
	boolean a= list1.addAll(list2);
	System.out.println("whether list was changed after appending?  "+a);

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
