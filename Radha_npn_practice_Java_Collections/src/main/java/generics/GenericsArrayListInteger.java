package generics;

import java.util.ArrayList;

public class GenericsArrayListInteger 
{
public static void main(String[] args) 
{
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	//it will allow to enter only integer type now since type safety is declared
	
	list.add(3);
	list.add(1, 5);
	
	System.out.println(list);
}
}
