package multithread;

public class ThreadClass {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			ThreadUsed th= new ThreadUsed();
			th.start();			
		}		
	}
}

class ThreadUsed extends Thread{
	
	@Override
	public void run() {
		try {
			System.out.println("Thread is running id: "+ Thread.currentThread().getId());
		} catch (Exception e) {
			System.out.println("Exception occurs.");
		}
		
	}
	
}
