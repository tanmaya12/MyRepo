package javafifty;
//convert a string totally into upper case and lower case and also to convert a particular word to upper and lower case
public class InsiseString_L2H 
{
	public static void main(String[] args) 
	{		
		String s="tanmayA Kumar BehERA";
		System.out.println(s+"\n"+s.toLowerCase()+"\n"+s.toUpperCase());
		String[] s1=s.split(" ");
		System.out.println(s+"\n"+s1[1].toUpperCase());
		String str="";
		for (int i = 0; i < s1.length; i++) 
		{
			if(i==1)
				str=str+s1[i].toUpperCase()+" ";
			else
				str=str+s1[i]+" ";
		}
		System.out.println(str);
	}
}
