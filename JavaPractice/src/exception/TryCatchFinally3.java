package exception;

public class TryCatchFinally3 {

	public static void main(String[] args) {
		//System.out.println(10/0);
		try {
			int a= Integer.parseInt("9");// args[0], a, 50, -5,7 9,
			System.out.println("1st try: "+a);
			//System.out.println(10/0);
			try {
				int[] x= new int[a];
				System.out.println("in nest try: "+x.length);
				System.out.println(10/0);
			} catch (NegativeArraySizeException e) {
				int[] x= new int[Math.abs(a)];
				System.out.println("in nest catch: "+x.length);
			}
			catch (ArithmeticException e) {
				System.out.println("Inner Arithmetic");
				System.out.println(5/0);
			}
			finally {
				System.out.println("in nest fanally");
			}
			int b=a+4;
			System.out.println("try block: "+b);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("pass one int value.");
		}catch (NumberFormatException e) {
			System.out.println("pass only int value.");
		}
//		catch (ArithmeticException e) {
//			System.out.println("Arithmetic");
//			//System.out.println(5/0);
//		}
		finally {
			System.out.println("try catch finally");
		}
		System.out.println("last");

	}

}
