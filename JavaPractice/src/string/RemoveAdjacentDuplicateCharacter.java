package string;

import java.util.ArrayList;
import java.util.ListIterator;

public class RemoveAdjacentDuplicateCharacter {

	public static void main(String[] args) {
		String s="AABBBzaaCCcCCDDDDnnn"; //ABzaCcCD
		System.out.println(s+"\n------After Removes----");
		System.out.println(using_StringBuffer(s));
		System.out.println(using_List(s));
		System.out.println(using_RegularExpresion(s));
		System.out.println(using_String(s));
	}
	
	static String using_StringBuffer(String s)
	{
		StringBuffer sb= new StringBuffer(s);
		
		for (int i = sb.length()-2; i >=0; i--) {
			char ch= sb.charAt(i);
			if (ch==sb.charAt(i+1)) {
				sb.deleteCharAt(i);
			}			
		}
		return sb.toString();
	}
	
	static String using_List(String s)
	{
		ArrayList<Character> ar= new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			ar.add(s.charAt(i));
		}
		for (int i = ar.size()-2; i >=0 ; i--) {
			if (ar.get(i) ==ar.get(i+1)) {
				ar.remove(i);
			}
		}
		System.out.println(ar);
		String temp="";
		for (Character ch : ar) {
			temp+=ch;
		}
		return temp;
	}
	static String using_RegularExpresion(String s) {
	    return s.replaceAll("(.)(\\1)+", "$1");
	}
	
	static String using_String(String s)
	{
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i)==s.charAt(i-1)) {
				s=s.substring(0,i-1)+s.substring(i+1,s.length());
				
			}
		}
		return s;
	}
	
	
	
	
	
	

}
