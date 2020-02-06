package exception;

public class Try_exit {

	public static void main(String[] args) {
		try {
			System.out.println("in try");
			//System.out.println(10/0);
			System.exit(146);
		} 
		finally {
			//System.exit(0);
			System.out.println("finally");
			System.exit(0);
		}
		System.out.println("after");
	}

}
