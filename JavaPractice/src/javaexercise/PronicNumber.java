package javaexercise;

public class PronicNumber {

	public static void main(String[] args) {
		int num=110;
		int count=0;
		
		for (int i = 0; i < num ; i++) 
		{
			if (i*(i+1)==num) 
			{
				count++; break;				
			}			
		}
		if (count==1) {
			System.out.println("pronic no.");
		} else {
			System.out.println("not pronic no.");
		}
	}

}
