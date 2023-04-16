package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample 
{
public static void main(String[] args) 
{
	ArrayList list = new ArrayList();
	
	list.add("One");
	list.add("two");
	list.add(2, 5);
	list.add(3, 10);
	list.set(3, 25);
	list.add(3, 15);
	//list.add(10, 10);
	
	//list.remove(4);
	//list.remove("One");
	//list.removeAll(list);
	
	System.out.println(list);
		
	//Iterator
	Iterator listIter = list.iterator();
	
	while(listIter.hasNext())
	{
		System.out.println(listIter.next());
	}
	
	//foreach
	for (Object element : list) {
		System.out.println(element);
	}
}
}
