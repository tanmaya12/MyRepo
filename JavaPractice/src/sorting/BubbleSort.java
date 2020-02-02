package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] a= {33,98,-23,0,12,2,54,4};
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			int temp,flag=0;
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if (flag==0) {
				break;
			}
		}
		System.out.println(Arrays.toString(a));
		
		//for String
		
		String[] s= {"acbu","tanu","zebra","kumar"};
		System.out.println(Arrays.toString(s));
		for (int i = 0; i < s.length; i++) {
			int flag=0;
			String temp="";
			for (int j = 0; j < s.length-1-i; j++) {
				if (s[j].compareTo(s[j+1])>0) {
					temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
					flag=1;
				}
			}
			if (flag==0) {
				break;
			}
		}
		System.out.println(Arrays.toString(s));
		
		
	}

}
