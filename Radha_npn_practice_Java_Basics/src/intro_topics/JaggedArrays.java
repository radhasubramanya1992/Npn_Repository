package intro_topics;

public class JaggedArrays {

	public static void main(String[] args) 
	{
		int[][] a = {{1,1},{0,0,0,0,0},{3,3,3}};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("");
		}

	}

}
