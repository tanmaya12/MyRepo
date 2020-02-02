package sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args)
	{
		int[] a= {33,98,-23,0,12,2,54,4};
		System.out.println(Arrays.toString(a));
		int temp, j;
		for (int i = 1; i < a.length; i++) {
			temp=a[i];
			j=i;
			while (j>0 && a[j-1]>temp) {
				a[j]=a[j-1];
				j--;
			}
			a[j]=temp;
		}
		System.out.println(Arrays.toString(a));
	}
}
