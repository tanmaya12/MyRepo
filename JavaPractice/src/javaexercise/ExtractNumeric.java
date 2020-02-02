package javaexercise;

public class ExtractNumeric {

	public static void main(String[] args) {
		String s= "T234@0nm350ay  KU&^3	46atr";
		String temp="";
		char[] ch= s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (!Character.isDigit(ch[i])) 
			{
				temp+=ch[i];
			}
		}
		System.out.println(temp);		
	}

}
