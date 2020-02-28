package java8;

public class Recursion {
	static int i=1;
	public static void main(String[] args) {
		int n=10;
		print(n);
		System.out.println("in Main out");
	}

	private static int print(int n) {
		if (n<1) {
			return n;
		} else {
			//System.out.println(n);
			System.out.println(i++);
			return print(--n);
		}
	}

}
