package exception;

public class Try_return {

	public static void main(String[] args) {
		System.out.println(m1());
	}

	private static int m1() {
		try {
			System.out.println("in try");
			//System.out.println(10/0);
			return 10;
		} 
		finally {
			System.out.println("finally");
			return 20;
		}
		
		//System.out.println("after try finally"); //unreachable error
		//return 1000;
	}

}
