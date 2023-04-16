package package1;

public class DefaultAccessInsidePck 
{
public static void main(String[] args) 
{
	//Default - access class
	DefaultDeclareExample defaultObj = new DefaultDeclareExample();
	
	//Default - access variables
	System.out.println(defaultObj.x);
	System.out.println(defaultObj.a);
	
	//Default - Access method
	defaultObj.displayDefault();	
}
}
