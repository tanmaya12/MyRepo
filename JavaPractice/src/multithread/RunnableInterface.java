package multithread;

public class RunnableInterface {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			RunnableUsed run= new RunnableUsed();
			new Thread(run).start();
		}
	}
}

class RunnableUsed implements Runnable {
	@Override
	public void run() {
		System.out.println("thread is running id :"+ Thread.currentThread().getId());
	}	
}