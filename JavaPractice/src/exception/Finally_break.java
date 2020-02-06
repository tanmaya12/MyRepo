package exception;

public class Finally_break {
	public static void main(String[] args) {
		int n=m1(2);
		System.out.println("after m1 "+ n);
	}
	private static int m1(int i) {
		while(i<=5) {
		try {
			System.out.println("in try"+i);
			//System.out.println(10/0);
			i++;
			return 10/0;
		} 
		catch (NullPointerException e) {
			System.out.println("catch");
			//return;
		}
		finally {
			System.out.println("finally");
			break;
		}
		}//while
		System.out.println("after all");
		return 70;
		
		
	}

}
