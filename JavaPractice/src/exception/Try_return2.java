package exception;

public class Try_return2 {

	public static void main(String[] args) {
		int n=m1();
		System.out.println("after m1 "+ n);
	}
	private static int m1() {
		try {
			System.out.println("in try");
			//System.out.println(10/0);
			return 10;
		} catch (NullPointerException e) {
			System.out.println("catch");
			//return;
		}
		finally {
			System.out.println("finally");
			//int[] i= new int[-2];
			if(true)
			return 20;
		}
		System.out.println("after all");
		return 70;
		
	}

}
