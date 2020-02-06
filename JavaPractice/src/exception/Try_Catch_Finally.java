package exception;

public class Try_Catch_Finally {

	public static void main(String[] args) {
		int a=6;
		try {
			a++;
			System.out.println("try"+a);
			for (int i = 0; i < 4; i++) {
				int n=10/0;
				continue;
			}
			//int n=10/0;
			//continue;
		} catch (Exception e) {
			a++;
			System.out.println("catch"+a);
			a++;
		}
		catch (Throwable e) {
			System.out.println("catch");
		}		
		finally 
		{
			System.out.println("final"+a);
		}
	
	}

}
