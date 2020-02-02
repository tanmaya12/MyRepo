package javademo;

class GFG 
{ 
		static char[] swap(String str, int i, int j) 
		{ 
			char ch[] = str.toCharArray(); 
			char temp = ch[i]; 
			ch[i] = ch[j]; 
			ch[j] = temp; 
			return ch; 
		} 
}
public class StringCharSwap 
{
		public static void main(String[] args) 
		{ 
			String s = "b5@tans2m#$h"; 
		
			for (int i = 0; i < s.length(); i++) 
			{
				char ch= s.charAt(i);
				if(!Character.isLetter(ch))
				{			
					System.out.println(GFG.swap(s, i, s.length()-1)); 
				}
			}

			//System.out.println(s); 
		} 
}
