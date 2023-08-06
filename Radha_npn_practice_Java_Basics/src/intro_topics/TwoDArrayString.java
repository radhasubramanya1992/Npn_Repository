package intro_topics;

public class TwoDArrayString 
{
public static void main(String[] args) {
	String[][] s = {{"red","green","blue"},{"white","black","yellow"}};
	
	for(int i=0;i<s.length;i++)
	{
		for(int j=0;j<s[0].length;j++)
		{
			System.out.print(s[i][j]+"\t");
		}
		System.out.println("");
	}
}
}
