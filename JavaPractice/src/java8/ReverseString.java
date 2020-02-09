package java8;

import java.util.stream.IntStream;

public class ReverseString {

	public static void main(String[] args) {
		String s="tanmay";
		char[] ch= s.toCharArray();
		//Prints characters
		IntStream.range(0, ch.length).mapToObj(j-> ch[(ch.length-1)-j]).forEach(System.out::print); //in char
		String res=s.chars().collect(StringBuilder::new, (b,c) -> b.insert(0,(char)c), (b1,b2) -> b1.insert(0, b2)).toString();
		System.out.println();
		System.out.println(res);
		
		System.out.println(rev(s));
	}
//without using muliple objects of string.
	private static String rev(String s) {
		char ch[]=s.toCharArray();
		int len=ch.length;
		char[] temp= new char[len];
		//int j=0;
		for (int i = len-1, j=0; i >=0; i--,j++) {			
			temp[j]=ch[i];
			//j++;			
		}
		return String.copyValueOf(temp);
		//return new String(temp);
	}

}
