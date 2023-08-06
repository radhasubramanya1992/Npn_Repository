package intro_topics;

import java.util.Arrays;
import java.util.List;

public class ArraysUtil 
{
public static void main(String[] args) 
{
	int [] a = {5,4,3,2,1};
	System.out.println("Original array:;;  "+Arrays.toString(a));
	
	Arrays.sort(a);
	
	System.out.println("Sorted array:;;  "+Arrays.toString(a));
	
	List <String> listedArray = Arrays.asList(Arrays.toString(a));
	
	System.out.println("Listed array:;;  "+listedArray);
}
}
