package exception;

public class Try_Break {

	public static void main(String[] args) {
		try {
			System.out.println("start try");
			for (int i = 0; i < 7; i++) {
				try {
				System.out.println(i);
				if(i==4)
					break;
				}
				finally {
					System.out.println("inner f");
				}
			}//for
			System.out.println("end try");
		} finally {
			System.out.println("in finally");
		}
	}

}
