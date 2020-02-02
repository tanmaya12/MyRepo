package javafifty;
//Write function to compute Nth Fibonacci number? Both iterative and recursive?
public class Fibonacci 
{
	public static int fibonacci(int number)
	{ 
		if(number == 1 || number == 2)
		{ return 1; }
		return fibonacci(number-1) + fibonacci(number -2); //tail recursion 
	}
	public static int fibonacci2(int number)
	{ 
		if(number == 1 || number == 2)
		{ return 1; } 
		int fibo1=1, fibo2=1, fibonacci=1; 
		for(int i= 3; i<= number; i++)
		{ //Fibonacci number is sum of previous two Fibonacci number 
			fibonacci = fibo1 + fibo2; 
			fibo1 = fibo2; 
			fibo2 = fibonacci; 
		}
			return fibonacci; //Fibonacci number 
	}

		
	
	public static void main(String[] args)
	{
		int n=500, t1=0,t2=1,sum=0;
//		for (int i = 0; t1 <=n; i++) 
//		{
//			System.out.print(t1+", ");
//			sum=t1+t2;
//			t1=t2;
//			t2=sum;
//		}
		while (t1 <= n)
        {
            System.out.print(t1 + ", ");

            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
		System.out.println();
		for (int i = 1; i < 10; i++) 
		{
			System.out.print(fibonacci2(i)+", ");
		}

	}
}
