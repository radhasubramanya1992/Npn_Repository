package generics;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListIntegerGeneric 
{
public static void main(String[] args) {
	
	List <Integer> genericList = new ArrayList<Integer>();
	
	genericList.add(3);
	
	System.out.println(genericList);
	
}
}
