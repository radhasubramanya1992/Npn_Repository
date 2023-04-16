package package2;

import package1.ProtectedDeclareExample;

public class ProtectedAccessOutsidePk extends ProtectedDeclareExample
{
	public static void main(String[] args) 
	{
		//below is invalid , bcz you are creating an object of parent class 
		//and trying to access its protected members, 
		//but its valid if you try to access its public members
//		ProtectedDeclareExample protectedObj = new ProtectedDeclareExample();
//		System.out.println(protectedObj.q);
//		protectedObj.displayProtected();	
		
		ProtectedAccessOutsidePk protObj2 = new ProtectedAccessOutsidePk();
		System.out.println(protObj2.q);
		protObj2.displayProtected();
	}
}
