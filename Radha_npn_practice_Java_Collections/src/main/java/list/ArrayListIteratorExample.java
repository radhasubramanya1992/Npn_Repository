package list;

import java.util.ArrayList;
import java.util.Iterator;
//any collection  can be iterated through iterator/for-each 
public class ArrayListIteratorExample 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(1);
		list.add("hi");
		list.add(2, "bye");	
		System.out.println(list);
		
		Iterator listIter = list.iterator();
		
		while(listIter.hasNext())
		{
			System.out.println(listIter.next());
		}	
		
		for (Object element : list) 
		{
			System.out.println(element);			
		}
	}
}
