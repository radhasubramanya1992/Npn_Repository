package map;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapIteratorExample 
{
	public static void main(String[] args) 
	{
		//add
		HashMap hm = new HashMap();
		hm.put("KeyOne", "valueOne");
		hm.put("KeyTwo", 2);
		hm.put(3, 3);
		hm.put(4, 4);
		
		//fetch
		System.out.println(hm);
		System.out.println("The value of KeyTwo is: "+hm.get("KeyTwo"));
		
		//Iterator
		Iterator hmIt = hm.entrySet().iterator();
		while(hmIt.hasNext())
		{
			System.out.println(hmIt.next());
		}
		
		//for-each
	    for (Object element : hm.entrySet()) {
		System.out.println(element);		
	}
	}
}
