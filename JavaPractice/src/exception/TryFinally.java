package exception;

public class TryFinally {

	public static void main(String[] args) {
		try {
			System.out.println("in try");
			return;
			//System.out.println(10/0);
		} finally {
			System.out.println("in fannly");
		}
		//System.out.println("after try finally");
	}

}
