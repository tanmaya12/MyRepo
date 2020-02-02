package sorting;

import java.util.Arrays;

public class QuickSortMiddle {
	public static void main(String[] args)
	{
		int[] a= {33,98,-23,0,12,2,54,4};
		System.out.println(Arrays.toString(a));
		QuickSortMiddle obj= new QuickSortMiddle();
		obj.quickSortRecursion(a,0,a.length-1);
		
		System.out.println(Arrays.toString(a));
	}

	private void quickSortRecursion(int[] array, int low, int high) {
		
		int pi= partion(array,low,high);
		if (low< pi-1) {
			quickSortRecursion(array,low,pi-1);
		} 
		if (pi < high) {
			quickSortRecursion(array,pi,high);
		} 
	}

	private int partion(int[] array, int low, int high) {
		int pivot=array[(low+high)/2];
		while(low<=high)
		{
			while(array[low]<pivot)
			{ low++;}
			while(array[high]>pivot)
			{ high--;}
			if(low<=high) {
				int temp=array[low];
				array[low]=array[high];
				array[high]=temp;
				low++;
				high--;
			}
		}
		return low;
	}

}
