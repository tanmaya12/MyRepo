package sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args)
	{
		int[] a= {33,98,-23,0,12,2,54,4};
		System.out.println(Arrays.toString(a));
		int min,temp=0;
		for (int i = 0; i < a.length; i++) {
			min=i;
			for (int j = i+1; j < a.length; j++) {
				if(a[j]< a[min])
				{
					min=j;
				}				
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		System.out.println(Arrays.toString(a));
		
	}

}
