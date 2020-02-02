package string;

public class CountNonLetters {

	public static void main(String[] args) {
		String s="+tan(*_maya kumar begera$11232";
		char[] ch= s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isAlphabetic(ch[i])) {
				System.out.print(ch[i]+", ");
			}
		}
		
	}

}
