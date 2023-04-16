package map;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample 
{
public static void main(String[] args) {
	HashMap hm = new HashMap();
	hm.put("KeyOne", "ValueOne");
	hm.put("keytwo", "2");
	hm.put("KeyThree", "3");
	//case sensitive key 
	hm.put("keyOne", "ValueOnNNe");
	//duplicate and other datatypes
	hm.put(1, 23);
	hm.put(1, 24);
	//replace
	hm.replace("KeyOne", "MyOwnValue");
	
	System.out.println(hm);
	
	System.out.println("The value of keyOne is :::  "+hm.get("KeyOne"));
	
	//contains
	
	if(hm.containsKey(1))
	{
	System.out.println("contains key");
	}
	
//	if(hm.containsKey(2))
//	{
//	System.out.println("contains key");
//	}

	//Iterator
	Iterator hapMapIter = hm.entrySet().iterator();
	
	while(hapMapIter.hasNext())
	{
		System.out.println(hapMapIter.next());
	}
	
	//foreach
	for (Object element :  hm.entrySet()) {
		System.out.println(element);
	}
}
}

