package javaexercise;

public class RemoveCharInString2 {

	public static void main(String[] args) {
		String s="chicken";
		System.out.println(s);
		int pos=3;
		s=s.substring(0,pos)+s.substring(pos+1,s.length());
		System.out.println(s);
		StringBuilder sb= new StringBuilder(s);
		sb=sb.deleteCharAt(pos);
		sb=sb.delete(0, sb.length());
		System.out.println("Remove:"+sb.toString()+"\nLength"+sb.length());
		
		String str="tanmay";
		str=str.replaceAll(str, "");
		System.out.println("str len= "+str.length());
		
		String t="kumar";		
		while(t.length()!=0)
		{	
			int i=0;
			t=removeChar(t,i);						
		}
		System.out.println("t len"+t.length());		
	}
	public static String removeChar(String s, int n) 
	{
		return s.substring(0,n)+s.substring(n+1,s.length());
	}

}
