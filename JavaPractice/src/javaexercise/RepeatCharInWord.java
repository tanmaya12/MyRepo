package javaexercise;

public class RepeatCharInWord {

	public static void main(String[] args) {
		String s="TODO Auto generated method stub";
		String[] sa=s.split(" ");
		
		
		for (int i = 0; i < sa.length; i++) 
		{
			System.out.print(sa[i].toString()+"\n----------------\n");
			for (int j = 0; j < sa[i].length(); j++) //char position pick from a word
			{
				for (int k = 0; k < sa[i].length(); k++) 
				{
					if ((sa[i].charAt(j)==sa[i].charAt(k)) && j!=k) 
					{
						System.out.println(sa[i].charAt(j));
					}
				}
			}
		}
		
	}

}
