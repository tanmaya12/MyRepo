package javaexercise;

import java.util.Arrays;

public class SortAraay {

	public static void main(String[] args) {

		int[] a= {9,0,-3,56,4,-98,34};
		System.out.println(Arrays.toString(a));
		for (int i = 0; i <a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) {
			if (a[i]<a[j]) {
				int temp=a[i+1];
				a[i+1]=a[i];
				a[i]=temp;
			}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
