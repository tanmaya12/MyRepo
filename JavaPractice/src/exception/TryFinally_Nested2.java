package exception;

public class TryFinally_Nested2 {
	public static void main(String[] args) {
		System.out.println(m1(2));
	}

	private static int m1(int i) {
		try {
			System.out.println("main try");
			try {
				System.out.println("inner try");
				System.out.println(10/0);
			}catch (NullPointerException e) {
				System.out.println("inner catch");
			} 
			finally {
				System.out.println("inner f");
				return 500; //o/p
			}
			//System.out.println("after inner");
			
		}catch (ArithmeticException e) {
			System.out.println("main c");
		} 
		finally {
			System.out.println("main f");
			//return 750;
		}
		System.out.println("all");
		return 100;
	}

}
