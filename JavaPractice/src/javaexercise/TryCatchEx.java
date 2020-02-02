package javaexercise;


public class TryCatchEx {

	public static void main(String[] args) {

		try {
			System.out.println("in try\n");
			System.out.println(10/0);
			
		} 
		catch (NullPointerException e) {	System.out.println("in catch");	}
		
		finally {System.out.println("in finally");}
		
		System.out.println("done");
	}

}
