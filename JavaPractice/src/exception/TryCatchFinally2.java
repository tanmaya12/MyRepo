package exception;

public class TryCatchFinally2 {

	public static void main(String[] args) {
		System.out.println(m1());
	}

	private static int m1() {
		int a=6;
		try {
			a++;
			System.out.println("try"+a);
//			for (int i = 0; i < 4; i++) {
//				int n=10/0;
//				continue;
//			}
			
			//int n=10/0;
			//continue;
		} catch (Exception e) {
			a++;
			System.out.println("catch"+a);
			a++;
			return a;
		}
		finally 
		{
			System.out.println("final"+a);
			return 14;
		}
		
	}
	

}
