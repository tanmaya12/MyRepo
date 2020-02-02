package javaexercise;
import java.util.Arrays;

public class RemoveEqualAdjacentInString {

	public static void main(String[] args)
	{
		String s="AABBBBBBCCCCPBBCDDDDD";// op-ABCDEF
		StringBuilder sb= new StringBuilder(s);
				
		for (int i = sb.length()-2; i >=0 ;i--) //1 way
		{							
				if (sb.charAt(i)==sb.charAt(i+1)) 
				{
					sb.deleteCharAt(i+1);
				}				
		}		
		System.out.println(sb.toString());
		System.out.println(s.replaceAll("(.)(\\1)+", "$1"));//2 way
		removeChar(s.toCharArray());
	}
	static void removeChar(char[] s)//3way
	{
		int j=0;
		for (int i = 1; i < s.length; i++) {
			if (s[j]!=s[i]) 
			{
				j++;
				s[j]=s[i];
			}
		}
		System.out.println(Arrays.copyOfRange(s, 0, j+1));
		
	}

}
