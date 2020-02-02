package javaexercise;

public class ArrayLast2First {

	public static void main(String[] args) {
		int[] n= {1,2,3,4,5}; //51234 with left to right rotation
		for (int i=0; i< n.length;i++) {
			System.out.print(n[i]+", ");
		}
		System.out.println("\ndone");
		for (int i = n.length-1; i >0 ; i--) 
		{
			int temp= n[i-1];
			n[i-1]=n[i];
			n[i]= temp;			
		}
		for (int i=0; i< n.length;i++) 
		{
			System.out.print(n[i]+", ");
		}
	}

}
