package multithread;

public class PrintOddEvenByTwoThreads {

	public static void main(String[] args) {
		PrintOutput print= new PrintOutput();
		OddThread odd= new OddThread(20, print);
		odd.setName("odd-thread");
		EvenThread even= new EvenThread(20, print);
		even.setName("even-thread");
		odd.start();
		even.start();
	}
}


class OddThread extends Thread
{
	int limit;
	PrintOutput print;
	public OddThread(int limit, PrintOutput print)
	{
		this.limit=limit;
		this.print=print;		
	}
	
	@Override
    public void run() 
    {
        int oddNumber = 1;        //First odd number is 1
         
        while (oddNumber <= limit)
        {
            print.odd(oddNumber);       //Calling printOdd() method of PrintOutput class             
            oddNumber = oddNumber + 2;         //Incrementing to next odd number
        }
    }
}
class EvenThread extends Thread
{
	int limit;
	PrintOutput print;
	public EvenThread(int limit, PrintOutput print)
	{
		this.limit=limit;
		this.print=print;		
	}
	
	@Override
    public void run() 
    {
        int evenNumber = 2;        //First even number is 2
         
        while (evenNumber <= limit)
        {
            print.even(evenNumber);       //Calling even() method of PrintOutput class
             
            evenNumber = evenNumber + 2;         //Incrementing to next even number
        }
    }
}