package package1;

public class ProtectedAccessInsidePck 
{
public static void main(String[] args) 
{
	//can be accessed inside package without inheritance 
	ProtectedDeclareExample protectedObj = new ProtectedDeclareExample();
	System.out.println(protectedObj.q);
	protectedObj.displayProtected();	
}
}
