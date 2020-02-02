package string;

public class AdjacentNextCharToNextCharInUpper {

	public static void main(String[] args) {
		String s="abcdefghijklmnopqrstuvwxyz";
		char ch[]=s.toCharArray();
		s="";
		for (int i = 0; i < ch.length; i++) {
			if (i%2!=0) {
				ch[i]=Character.toUpperCase((char) ((int)ch[i]+1));
				s+=ch[i];
			} else {
				s+=ch[i];
			}
		}
		System.out.println(s);
	}

}
