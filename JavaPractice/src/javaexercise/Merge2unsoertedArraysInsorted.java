package javaexercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Merge2unsoertedArraysInsorted {

	public static void main(String[] args) {
		
		int[] a1= new int[] {12, -7, 18, 9, 37, -1, 21};
		int[] a2= new int[] {27, 8, 71, -9, 18};
		
		int[] ma= new int[a1.length+a2.length];
		int count=0;
		for (int i = 0; i < a1.length; i++) {
			ma[count]=a1[i];
			count++;
		}
		for (int i = 0; i < a2.length; i++) {
			ma[count]=a2[i];
			count++;
		}
		
		Arrays.sort(ma);
		System.out.println(Arrays.toString(ma));
		
		//sol2
//		ArrayList<Integer> al= new ArrayList<>();
//		for (int i = 0; i < a1.length; i++) {
//			al.add(a1[i]);
//		}
//		for (int i = 0; i < a2.length; i++) {
//			al.add(a2[i]);
//		}
//		System.out.println(al);
//		Collections.sort(al);
//		System.out.println(al);

	}

}
