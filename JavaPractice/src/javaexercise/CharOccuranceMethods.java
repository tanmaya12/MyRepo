package javaexercise;

import java.util.HashMap;
import java.util.Map.Entry;

public class CharOccuranceMethods 
{
	public static void main(String[] args) 
	{
		String s=" TODO Auto generated method stub";
				
		charOccuranceUsingArray(s);
		charOccuranceUsingCollection("tssanmaysssssss");
		charOccuranceUsingString(s);
		
	}
	static void charOccuranceUsingCollection(String s)
	{
		char[] ch=s.toCharArray();
		HashMap<Character, Integer> m= new HashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) 
		{
			if (m.containsKey(ch[i]))
			{
				m.put(ch[i], m.get(ch[i])+1);
			} else {
				m.put(ch[i], 1);
			}			
		}
		for (Entry<Character, Integer> e : m.entrySet()) 
		{
			System.out.println(e.getKey()+" = "+e.getValue());
		}
	}
	 static void charOccuranceUsingArray(String str) 
	    { 
	        // Create an array of size 256 i.e. ASCII_SIZE 
	        int count[] = new int[256]; 	  
	        // Initialize count array index 
	        for (int i = 0; i < str.length(); i++) 
	            count[str.charAt(i)]++; 	  
	        // Create an array of given String size 
	        char ch[] = new char[str.length()]; 
	        for (int i = 0; i < str.length(); i++) 
	        { 
	            ch[i] = str.charAt(i); 
	            int find = 0; 
	            for (int j = 0; j <= i; j++) 
	            {  // If any matches found 
	                if (str.charAt(i) == ch[j])  
	                    find++;                 
	            } 
	  
	            if (find == 1)  
	                System.out.println("Number of Occurrence of " + str.charAt(i) + " is:" + count[str.charAt(i)]);             
	        } 
	    } 
	static void charOccuranceUsingString(String s)
	{
		    //String result="";
		    StringBuilder sb = new StringBuilder(s);
		    while(sb.length() != 0)
		    {
		        int count = 0;
		        char test = sb.charAt(0); //get char from pos=0
		        while(sb.indexOf(test+"") != -1)// detect char at pos
		        {
		            sb.deleteCharAt(sb.indexOf(test+""));// delete char at pos
		            count++; //count deletions per char
		        }
		        //System.out.println(test+" is repeated "+count+" number of times");
		        //result=result+test+count;
		        System.out.println(test+" = "+count);
		    }
	}

}
