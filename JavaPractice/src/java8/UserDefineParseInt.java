package java8;

public class UserDefineParseInt {

	public static void main(String[] args) {
		String s="012000345";
		System.out.println(Integer.parseInt(s));
		char[] ch = s.toCharArray();
		System.out.println(Character.getNumericValue(ch[0]));
		long pos=1, res=0;
		for (int i = ch.length-1; i >=0; i--) {
			//int a= Character.getNumericValue(ch[i]);
			
			//ASCII value of '0'= 48, '1'=49  here works like this 49-48=1
			int a= ch[i] - '0'; // without using wrapper class and its methods
			a*=pos;
			res+=a;
			pos*=10;
		}
		System.out.println(res);		
	}
}
