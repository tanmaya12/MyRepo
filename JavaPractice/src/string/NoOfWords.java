package string;

public class NoOfWords {

	public static void main(String[] args) {
		String s="TODO\tAuto gene rated\nme thod stub\td f\ndfd jkdjf sjbfj";
		s=s.replaceAll("\n", " ");
		s=s.replaceAll("\t", " ");
		String[] words=s.split(" ");
		System.out.println("No. of words: "+words.length);
		
		for (String string : words) {
			System.out.println(string);
		}	

	}

}
