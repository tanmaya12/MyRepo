package sorting;

import java.util.Arrays;

public class HeapSort {
	public static void main(String[] args)
	{
		int[] a= {33,98,-23,0,12,2,54,4};
		System.out.println(Arrays.toString(a));
		HeapSort obj= new HeapSort();
		obj.sort(a);
		
		System.out.println(Arrays.toString(a));
	}

	private void sort(int[] a) {
		int len= a.length;
		for (int i = len/2-1; i>=0; i--) {
			heapify(a,len,i);
		}
		
		//swap element and heapify() again
		for (int i = len-1; i>=0; i--) {
			int temp=a[0];
			a[0]=a[i];
			a[i]=temp;
			heapify(a, i, 0);
			
		}
	}

	private void heapify(int[] a, int n, int i) {
		int largest=i;// parent node index
		int leftIndex=2*i+1;//left child node index
		int rightIndex= 2*i+2;//right child node index
		if (leftIndex<n && a[leftIndex]>a[largest]) {
			largest=leftIndex;
		}
		if (rightIndex<n && a[rightIndex]>a[largest]) {
			largest=rightIndex;
		}
		if (largest !=i) {
			int temp=a[i];
			a[i]=a[largest];
			a[largest]=temp;
			heapify(a, n, largest);
					
		}
	}

}
