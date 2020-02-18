package multithread;

class JoinMethod extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i + Thread.currentThread().getName());
		}
	}

	public static void main(String args[]) {
		JoinMethod t1 = new JoinMethod();
		JoinMethod t2 = new JoinMethod();
		JoinMethod t3 = new JoinMethod();
		t1.start();
		t1.setName(" t1");
		try {
			t1.join(1500);
		} catch (Exception e) {
			System.out.println(e);
		}

		t2.start();
		t2.setName(" t2");
		t3.start();
		t3.setName(" t3");
	}
}
