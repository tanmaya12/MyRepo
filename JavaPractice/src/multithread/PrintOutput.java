package multithread;

public class PrintOutput 
{
	//A boolean flag variable to check whether odd number is printed or not
    //Initially it is false.
	boolean isOdd=false;
	
	//synchronized printOdd() method to print odd numbers. It is executed by OddThread.
    //First checks isOddPrinted, 
    //if isOddPrinted is true then it waits until next even number is printed by EvenThread
    //If isOddPrinted is false then prints next odd number, sets isOddPrinted to true
    //sleeps for 1 second before notifying EvenThread
     
	synchronized void odd(int num)
	{
		while(isOdd)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" : "+num);
		isOdd=true;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		notify();
		
	}
	//Synchronized printEven() method to print even numbers. It is executed by EvenThread.
    //First checks isOddPrinted, 
    //if isOddPrinted is false then it waits until next odd number is printed by OddThread
    //If isOddPrinted is true then it prints next even number, sets isOddPrinted to false
    //sleeps for 1 second before notifying OddThread
     	
	synchronized void even(int num)
	{
		while(! isOdd)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" : "+num);
		isOdd=false;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		notify();
	}

}
