package multithread;

public class TestMain {

	public static void main(String[] args) {
		ThreadDemo th1= new ThreadDemo();
		ThreadDemo th2= new ThreadDemo();
		ThreadDemo th3= new ThreadDemo();
		
		th1.start();
		th2.start();
		th3.start();
	}

}
