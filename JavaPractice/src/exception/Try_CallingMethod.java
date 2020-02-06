package exception;

public class Try_CallingMethod {

	public static void main(String[] args) {
		System.out.println("main s");
		try {
			m1();
		} catch (Exception e) {
			System.out.println("in c");
		}
		System.out.println("all");
	}

	private static void m1() {
		System.out.println("in m1");
		System.out.println(10/0);
		System.out.println("m1 e");
	}

}
