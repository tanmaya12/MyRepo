package javaexercise;

public class WordSearchInString 
{
	public static void main(String[] args) 
	{
		String s="Enhance testing and project quality metrics tanmay by working with team.";
		String[] sa=s.split(" ");
		int count=0;
		for (int i = 0; i < sa.length; i++) 
		{
			if ("tanmay".equals(sa[i].toString())) 
			{
				count++;
			}
		}
		if (count>=1) 
		{
			System.out.println("present");
		} else {
			System.out.println("not present");
		}

	}
}
