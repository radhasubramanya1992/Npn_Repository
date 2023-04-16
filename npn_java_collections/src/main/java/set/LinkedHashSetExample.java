package set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample 
{
public static void main(String[] args) 
{
	LinkedHashSet set = new LinkedHashSet();
	
	set.add(50);
	set.add(1);
	set.add(1);
	set.add("two");
	set.add("z");
	
	System.out.println(set);
}
}
