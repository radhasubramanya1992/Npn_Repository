package com.npn.practice;

public class JaggedArray 
{
	public static void main(String[] args) 
	{
		//int [][] test = new int [3][] ;
//		test[0] = new int [] {1,2,3};
//		test[1] = new int[] {1,2,3,4,5};
//		test[2] = new int[] {8,9};
		
		int [][] test = {{1,2,3,4,5},{1,2,3},{1}};
		
		System.out.println("No.of rows::: "+test.length);
		System.out.println("Column length of row1:::  "+test[0].length);
		System.out.println("Column length of row2:::  "+test[1].length);
		System.out.println("Column length of row3:::  "+test[2].length);
		
		for(int i =0; i<test.length;i++)
		{
			for(int j=0;j<test[i].length;j++)
			{
				System.out.print(test[i][j]+"\t");
			}
			System.out.print("\n");
		}		
	}

}
