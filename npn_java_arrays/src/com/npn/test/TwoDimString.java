package com.npn.test;

public class TwoDimString {
public static void main(String[] args) {
	String[][] s = {{"dog","cat","pig"},{"rose","jasmine","Tulip"}};
	for(int i =0;i<s.length;i++)
	{
		for(int j=0;j<s[0].length;j++)
		{
			System.out.print(s[i][j]+"\t");
		}
		System.out.println("\n");
	}
}
}
