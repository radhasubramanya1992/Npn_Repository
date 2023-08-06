package map;

import java.util.HashMap;

public class HashMapExample 
{
public static void main(String[] args) 
{
	//add
	HashMap hm = new HashMap();
	hm.put("KeyOne", "valueOne");
	hm.put("KeyTwo", 2);
	hm.put(3, 3);
	hm.put(4, 4);
	
	//duplicate
	hm.put(3, 5);
	
	//fetch
	System.out.println(hm);
	System.out.println("The value of KeyTwo is: "+hm.get("KeyTwo"));
}
}
