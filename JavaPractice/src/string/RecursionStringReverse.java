package string;


public class RecursionStringReverse {
	public static void main(String[] args) {
		String s="12345";
		//System.out.println(s.substring(1)+s.charAt(0));
		System.out.println(recursion(s));
		recursion2(s);
	}

	private static String recursion(String s) {
		if(s.isEmpty())
			return s;		
		return recursion(s.substring(1))+s.charAt(0);
	}
	private static void recursion2(String s) {//character wise printing
		if (s.length()<=1  || s==null) {
			System.out.println(s);  //1
		} else {
			System.out.print(s.charAt(s.length()-1));//5432
			recursion2(s.substring(0, s.length()-1));
		}		 
	}

}
