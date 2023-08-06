package set;

import java.util.HashSet;

public class HashSetExample 
{
public static void main(String[] args) 
{
	HashSet set = new HashSet();
	set.add("One");
	set.add("Two");
	set.add("Two");
	set.add(3);
	set.add(5);
	set.add("z");
	
	set.remove(5);
	
	System.out.println(set);
}
}
