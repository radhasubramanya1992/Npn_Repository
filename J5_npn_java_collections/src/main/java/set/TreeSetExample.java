package set;

import java.util.TreeSet;

public class TreeSetExample 
{
public static void main(String[] args) {
	TreeSet set = new TreeSet();
	
	set.add(50);
	//set.add("apple");
	set.add(1);
	//set.add("zebra");
	set.add(5.5);
	
	System.out.println(set);
}
}
