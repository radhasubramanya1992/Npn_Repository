package package2;

import package1.PublicDeclareExample;

public class PublicAccessExample 
{
public static void main(String[] args) 
{
	//public - access class 
	PublicDeclareExample pubObj = new PublicDeclareExample();
	//public - access variables 
	System.out.println(pubObj.number);
	System.out.println(pubObj.name);
	
	//public - access method
	pubObj.displayPublic();	
}
}
