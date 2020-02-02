package javaexercise;

public class CharOccuranceUsingStringBuilder 
{
	public static void main(String[] args) 
	{		
		String s="tanmaya";
	    StringBuilder sb = new StringBuilder(s);
	    while(sb.length() != 0)
	    {
	        int count = 0;
	        char ch = sb.charAt(0);
	        while(sb.indexOf(ch+"") != -1)
	        {
	            sb.deleteCharAt(sb.indexOf(ch+""));
	            count++;
	        }
	        System.out.println(ch+" = "+count);
	    }
	}
}
