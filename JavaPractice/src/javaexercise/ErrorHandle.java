package javaexercise;

public class ErrorHandle {

	public static void main(String[] args) {
		try {
			for (int i = 1111; i>0 ; i++) {
				System.out.println(i*i);
			}
			
		} catch (Exception e) {
			System.out.println("catch\n"+e.getMessage());
		}
		finally
		{
			System.out.println("finally");
		}
	}

}
