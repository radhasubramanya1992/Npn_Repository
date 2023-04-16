package com.npn.practice4;

import com.npn.practice3.TestPublic3;

public class TestProtected extends TestPublic3
{
	public static void main(String[] args) 
	{
		//TestPublic3 TestPublic3Obj = new TestPublic3();
		//TestPublic3Obj.methodC();
		TestProtected TestProtectedObj = new TestProtected();
		TestProtectedObj.methodC();
	}	
}
