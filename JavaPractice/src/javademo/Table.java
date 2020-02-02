package javademo;

public class Table 
{
	public static void main(String[] args) 
	{
		int columns= 3;
		int rows= 5;
		String[][] table= new String[rows][columns];
		String chain="";
		for (int i = 0; i < table.length; i++) //5
		{
			for (int j = 0; j < table[1].length; j++) //3
			{
				chain +="|" +table[i][j];				
			}
			chain+="|\n";
		}
		System.out.println(chain);
	}
}
