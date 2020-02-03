package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AllSubstrings {

	public static void main(String[] args) {
		String s="aabca";
		allSubstrings2(s);
		
	}

	private static void allSubstrings(String s) {
		// Pick starting point 
        for (int len = 1; len <= s.length(); len++) { 
            // Pick ending point 
            for (int i = 0; i <= s.length() - len; i++) { 
                //  Print characters from current 
                // starting point to current ending 
                // point.   
                int j = i + len - 1; 
                for (int k = i; k <= j; k++) { 
                    System.out.print(s.charAt(k)); 
                } 
  
                System.out.println(); 
            } 
        } 
	}
	private static void allSubstrings2(String s) {
		Set<String> set= new LinkedHashSet<String>();
		List<String> li=new ArrayList<String>();
		int k=s.length()-1;
		for (int i = 0; i < s.length(); i++) {
			for (int j = k; j>=0; j--) {
				System.out.println(s.substring(i, s.length()-j));
				set.add(s.substring(i, s.length()-j));
				li.add(s.substring(i, s.length()-j));
			}
			k--;
		}
		System.out.println(set);
		System.out.println(li);
	}

}
