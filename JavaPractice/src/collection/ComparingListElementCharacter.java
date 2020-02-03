package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ComparingListElementCharacter {

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>(Arrays.asList("Hello","hi","kumar"));
		List<String> b = new ArrayList<String>(Arrays.asList("World","bye","7654@$"));
		//compare a[0] & b[0] repeated character are 'o','l' then print YES if non repeated then "NO"
		//compare a[1] & b[1] repeated character are non then print "NO"
			compareRepeatChar(a,b);
	}

	private static void compareRepeatChar(List<String> a, List<String> b) {
		
		for (int i = 0,j=0; i < a.size()|| j<b.size(); i++,j++) {
			Set<Character> s= new HashSet<Character>();
			for (int k = 0; k < a.get(i).length(); k++) {
				s.add(a.get(i).charAt(k));
			}
			for (int k = 0; k < b.get(j).length(); k++) {
				s.add(b.get(j).charAt(k));
			}
			System.out.println(s +"="+s.size());
			System.out.println((a.get(i).length() + b.get(j).length()));
			
			if (s.size() < (a.get(i).length() + b.get(j).length())) {
				System.out.println("YES");
			} else if (s.size() == (a.get(i).length() + b.get(j).length())) {
				System.out.println("NO");
			}
			
		}
	}

}
