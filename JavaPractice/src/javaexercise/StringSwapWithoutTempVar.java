package javaexercise;

public class StringSwapWithoutTempVar {

	public static void main(String[] args) {
		String s1="tanmay";
		String s2="kumar";
		int n1=s1.length();
		System.out.println("Before swap: s1= "+s1+"  s2= "+s2);
		s1=s1.concat(s2);
		s2=s1.substring(0,n1);
		s1=s1.substring(n1,s1.length());
		System.out.println("After  swap: s1= "+s1+"  s2= "+s2);

	}

}
