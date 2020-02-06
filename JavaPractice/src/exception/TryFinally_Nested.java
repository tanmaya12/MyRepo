package exception;

public class TryFinally_Nested {

	public static void main(String[] args) {
		System.out.println(m1(2));
	}

	private static int m1(int i) {
		while(i==5) {
			try {
				try {
					i=15;
				} finally {
					i=20;
				}
				i=100;
				return i;
			} finally {
				if(i==100)
					//break;
					continue;
			}
		}//while
		
		return 10000;
	}

}
