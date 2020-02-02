package sorting;

import java.util.Arrays;

public class MergeSort {
	int array[];
	int temparray[];
	int length;
	public static void main(String[] args)
	{
		int[] a= {33,98,-23,0,12,2,54,4};
		System.out.println(Arrays.toString(a));
		MergeSort obj= new MergeSort();
		obj.sort(a);
		
		System.out.println(Arrays.toString(a));
	}

	private void sort(int[] a) {
		this.array=a;
		this.length=a.length;
		this.temparray= new int[length];
		divideArray(0,length-1);
	}
	private void divideArray(int lowerIndex, int higherIndex) {
		if (lowerIndex<higherIndex) {
			int middle= lowerIndex+(higherIndex-lowerIndex)/2;
			//for left part
			divideArray(lowerIndex, middle);
			//for right part
			divideArray(middle+1, higherIndex);
			
			mergeArray(lowerIndex,middle,higherIndex);
		}
		
	}
	private void mergeArray(int lowerIndex,int middle, int higherIndex) {
		for (int i = lowerIndex; i <= higherIndex; i++) {
			temparray[i]=array[i];			
		}
		int i= lowerIndex;
		int j= middle+1;
		int k= lowerIndex;
		while(i<=middle && j<=higherIndex)
		{
			if (temparray[i]<=temparray[j]) {
				array[k]=temparray[i];
				i++;				
			} else {
				array[k]=temparray[j];
				j++;
			}
			k++;
		}
		while (i<=middle) {
			array[k]=temparray[i];
			k++;
			i++;
		}
	}


}
