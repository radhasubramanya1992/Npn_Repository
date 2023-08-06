package com.npn.test;

public class TestA {
	public static void main(String[] args) {
		int x=2,y=3;
		
		System.out.println("hi");
		System.out.println("Shaq is 7\'1\""); 
		System.out.println("The string \"\" is an empty message.");
		System.out.println("\\'\"\"");
		
		System.out.println("This is a test of your"+"\n"+"knowledge of \"quotes\" used"
		+"\n"+"in \'string literals.\'"+"\n"+"You're bound to \"get it right\""
				+"\n"+"if you read the section on"+"\n"+"\"quotes.\"");
		System.out.printf("x = %d%n", y);
		System.out.printf("Value of %d + %d is %d%n", x, x, (x + x));
		System.out.printf("x =");
		System.out.printf("%d = %d%n", (x + y), (y + x));
		
		System.out.println(x=23 % 8 % 3);
		System.out.printf("*%n**%n***%n****%n*****%n");
	
	}
}
	class SampleProgram47
	{
		static void test1()
		{
		System.out.println("Running test1() method"+num);
		return;
		}
		public static void main(String[] args)
			{
				System.out.println("program starts.....");
				System.out.println(test1());
				//invoke method and print its return value
				// error because print statement print statemetn cannot print void
				System.out.println("program ends.....");
			}
	} 

//	class SampleProgram47
//	{
//		static int test1(int num)
//		{
//		System.out.println("Running test1() method"+num);
//		return num;
//		}
//		public static void main(String[] args)
//			{
//				System.out.println("program starts.....");
//				System.out.println(test1(3));
//				//invoke method and print its return value
//				// error because print statement print statemetn cannot print void
//				System.out.println("program ends.....");
//			}
//	} 
//
//}
