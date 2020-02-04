package string;

public class InfiniteAppend {

	public static void main(String[] args) {
		String s="abcd";
		long n=10L;
		StringBuilder sb= new StringBuilder((int) n);
		while(s.length()<= n) {
			//sb.append(s);
			s=s.concat(s);
		}
		System.out.println(sb.toString().length());
		System.out.println(s.length());
//		s=sb.substring(0,  (int)n);
//		System.out.println(sb.substring(0, 13).length());
//		
//		System.out.println(s);
//		long count= s.chars().filter(ch-> ch=='a').count();
//		long count2 = s.codePoints().filter(ch -> ch == 'e').count();
//		System.out.println(count);
	}
	private static long repeatedString(String s, long n) {
		long acount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a')
				acount++;
		}
		long grp = n / s.length();
		long rem = n % s.length();
		acount = grp * acount;
		for (int i = 0; i < rem; i++) {
			if (s.charAt(i) == 'a')
				acount++;
		}
		return acount;
	}

}
