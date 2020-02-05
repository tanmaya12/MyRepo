package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class How_Many_Substrings {
	static int[] countSubstrings(String s, int[][] queries) {
		int[] a= new int[queries.length];
		for (int i = 0; i < queries.length; i++) {
			//s.substring(queries[i][0], queries[i][1]);
			a[i]= allSubstrings(s.substring(queries[i][0], queries[i][1]+1));
			
		}
		
        return a;

    }


    public static void main(String[] args){
        String s = "aabaa";
        //System.out.println(s.substring(0, 1));
        int[][] queries = {{1, 1},{1, 4},{1, 1},{1,4},{0, 2}};     

        int[] result = countSubstrings(s, queries);

        System.out.println(Arrays.toString(result));

    }
    
    private static int allSubstrings(String s) {
    	System.out.println(s);
		Set<String> set= new LinkedHashSet<String>();
		//List<StringBuffer> li=new ArrayList<StringBuffer>();
		if(s.length()==1) 
			return 1;
		int k=s.length()-1;
		for (int i = 0; i < s.length(); i++) {
			for (int j = k; j>=0; j--) {
				set.add(s.substring(i, s.length()-j));
				//set.add(s.substring(i, s.length()-j).toString());
				//li.add(s.substring(i, s.length()-j));
			}
			k--;
		}
		return set.size();
		
	}
    
    private static int numOfSubs(int start, int end, String str, ArrayList<String> distinctSubs) {

        for (int i = 1; i <= (end - start); i++) {
            for (int j = start; j <= (end - i + 1); j++) { 
                checkSub(str.substring(j, j+i),  distinctSubs);
            }
        }
        int a = distinctSubs.size() + 1;
        return a;
    }

    private static void checkSub(String str, ArrayList<String> distinctSubs) {
        int n = 0;
        for (int i = 0; i < distinctSubs.size(); i++) {
            if (distinctSubs.get(i).equals(str)) {
                n++;
                break;
            }
        }
        if (n == 0) {
            distinctSubs.add(str);
        }
    }

}
