package exception;

class MyException extends Exception{

	public MyException(String string) {
		System.out.println("Ha haa haa Error");
	}
	
}

public class User_Exception {

	public static void main(String[] args) throws MyException {
		
		if(true) {
			System.out.println("main");
			throw new MyException("throws work");
		}

	}

}
