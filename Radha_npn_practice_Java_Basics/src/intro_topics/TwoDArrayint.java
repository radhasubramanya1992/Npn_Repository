package intro_topics;

public class TwoDArrayint 
{
public static void main(String[] args) 
{
	int[][] a = {{0,0},{1,1},{2,2}};
	System.out.println("no.of rows  are:::"+a.length);
	System.out.println("no.of columns  are:::"+a[0].length);
	for(int i=0;i<a.length;i++)
	{
		for (int j=0;j<a[0].length;j++)
		{
			System.out.print(a[i][j]);
			System.out.print("\t");
			
		}
		System.out.print("\n");
	}

}
}
