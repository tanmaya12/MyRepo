package multithread;

public class ThreadDemo extends Thread{
	public void run()
	{
		for (int i = 0; i < 6; i++) {
			System.out.println(i+" -> Thread Name: "+Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
