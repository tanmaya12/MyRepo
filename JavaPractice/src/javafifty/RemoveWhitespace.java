package javafifty;

public class RemoveWhitespace 
{
	static String removeSpace(String s)
	{
		for (int i = 0; i < s.length(); i++) 
		{
			char ch[]=s.toCharArray();
			if(ch[i]==' '||ch[i]==9) //ASCII value of TAB=9
			{
				s= s.substring(0, i)+s.substring(i+1);
			}
		}
		return s;
		
	}
	public static void main(String[] args) 
	{
		String s="ahbd clju&^ %#jml 97 0	85 ][ ,. ewwf Aa l k	jn";
		String str="";
		System.out.println(s);
		System.out.println(removeSpace(s));
		//s=s.replace(" ","");// remove only space charcter not tab
		s=s.replaceAll("\\s+", "");// "\\w+"--remove digits & letter , "\\W+"--remove all special char
									//"\\s+" -- remove white spaces include tab, "\\S+"-- remove all expect whitespace & tab
		
		//remove only space using temorary memory
		/*for (int i = 0; i < s.length(); i++) 
		{
			char ch= s.charAt(i);
			if (ch!=' ') 
			{
				str=str+ch;
			}
		}*/
		
		s=str;
		System.out.println(s);
		
		
	}


	  
}