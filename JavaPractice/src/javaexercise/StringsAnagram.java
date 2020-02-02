package javaexercise;
import java.util.Arrays;

public class StringsAnagram {
	static void anagram(String s1, String s2)
	{
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if (Arrays.equals(ch1, ch2)) {
			System.out.println("anagram");
		} else {
			System.out.println("not anagram");
		}
	}
	static void anagram1(String s1, String s2) 
	{
		int count=0;
		if (s1.length()==s2.length()) 
				{		
					for (int i = 0; i < s1.length(); i++) 
					{
						for (int j = 0; j < s2.length(); j++) 
						{
							if (s1.charAt(i)==s2.charAt(j)) 
							{
								count++;					
							}
						}			
					}
				} 
		if (count==s1.length()) 
				{
					System.out.println("anagram");
				} else {
					System.out.println("not anagram");
				}
	}

	public static void main(String[] args) {
		String s1="army";
		String s2="ryma";
		anagram(s1,s2);		
		anagram1(s1,s2);
		

	}

}
