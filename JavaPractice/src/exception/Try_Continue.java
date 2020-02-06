package exception;

public class Try_Continue {

	public static void main(String[] args) {
		System.out.println("start");
			for (int i = 0; i < 7; i++) {
				try {
					System.out.println(i);
					if(i==4)
						continue;
				}
				finally {
					System.out.println("inner f");
				}
			}//for
			System.out.println("end");
				
	}

}
