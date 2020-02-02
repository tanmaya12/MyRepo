package javaexercise;

import java.util.ArrayList;

public class JAVAEX2 {

	public static void main(String[] args) {
		int[] ar= {0,2,-3,1,-20,89,3,-45,10,-10,56};// o/p= 0, +ve nos then -ve nos
		
		//using list
		ArrayList<Integer> l=new ArrayList<>();
		for (int i = 0; i < ar.length; i++) 
		{
			if (ar[i]>=0) {
				l.add(ar[i]);
			}
		}
		for (int i = 0; i < ar.length; i++) 
		{
			if (ar[i]<0) {
				l.add(ar[i]);
			}
		}		
		System.out.println(l);
		
		//using swapping position
		for (int i = 0; i < ar.length/2; i++) 
		{
			for (int j = ar.length-1; j > ar.length/2; j--) 
			{
				if ((ar[i]<0) & (ar[j]>=0) )
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}			
		}
		for (Integer i : ar) {
			System.out.print(i+", ");
		}
		
	}

}
