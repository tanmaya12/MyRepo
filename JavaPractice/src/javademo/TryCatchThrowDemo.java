package javademo;

class ThDemo
{
	int demo() throws ArithmeticException
	{
		String s1 = "1";
		String s2 = "  ";
		int x1= Integer.parseInt(s1);
		int x2= Integer.parseInt(s2);
		return x1/x2;
	}
	
	
}



public class TryCatchThrowDemo 
{

	public static void main(String[] args) 
	{
		
		try {
			ThDemo d= new ThDemo();
			//d.demo();
		//int div = 10/0;
		int x2= Integer.parseInt("yfhgf");
		System.out.println("div="+x2);
			}catch (ArithmeticException ae)
		{
				System.out.println("Dont enter zero in denominator");
			}
		/*finally {
				System.out.println("final");
			}
		try {
		System.out.println(args[4]);
			}catch (ArrayIndexOutOfBoundsException are) 
				{
					System.out.println("Dont enter ");
				}*/
		catch (Throwable e) {
			//System.err.println(e.getMessage());
			//System.err.print(e.printStackTrace());
			e.printStackTrace();
		}

	}

}
