package javaexercise;

public class PrintPossibleCombitions 
{
	static int count=0;
	public static void main(String[] args)
	{
		String s="abc";
		//output= abc,acb,bac,bca,cab,cba
		PrintPossibleCombitions ppc= new PrintPossibleCombitions();
		ppc.permute(s, 0, s.length()-1);
		 System.out.println("\ntotal words: "+count);
	}
	private void permute(String str, int l, int length) 
    { 
        if (l == length) 
        {
        	System.out.print(str+" "); count++;
        }
        else
        { 
            for (int i = l; i <= length; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, length); 
                str = swap(str,l,i); 
            } 
        }       
    }
	public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
}
