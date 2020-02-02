package javafifty;
//How to handle an exception in Java programming (try an example using try/catch, throws)
@SuppressWarnings("serial")
class LogicException extends Exception
{
	LogicException(String s)
	{
		System.out.println(s);
	}
}

public class ExceptionHandeling 
{
	static void div(int a) throws LogicException
	{
		if(a<0)
		{
			LogicException le= new LogicException("Logic error in ur statement");
			throw le;
		}
	}
	public static void main(String[] args) 
	{
		try 
		{
			div(-10);			
		}
		catch (LogicException e) {
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
		finally 
		{
			System.out.println("In finally block");
		}	

	}
}
