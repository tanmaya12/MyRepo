package array;

public class SumOfAdajacentElementsInSqareArray {

	public static void main(String[] args) {
		int[][] a= {
				{1,2,3,4},
				{5,6,7,8},
				{10,11,12,13},
				{14,15,16,17}};			//= new int[3][3];
		int n=11;
		int sum= adjacentSum(a,n);
		System.out.println("surrounding of "+n+" = "+sum);
	}

	private static int adjacentSum(int[][] a, int n) {
		//find Position of n;
		int x=0,y=0,sum=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(n==a[i][j]) {
					x=i;
					y=j;
				}
			}
		}
		System.out.println("position of "+n+" = ("+x+","+y+")");
		//add that surrounding elements of that position
		for (int i = x-1; i <=x+1; i++) {
			for (int j = y-1; j <=y+1; j++) {
				//if(i != x && j != y) {
					sum+=a[i][j];
					System.out.print("("+i+","+j+"), ");//3X3 matrix surrounding of element n
				//}
			}
		}
		System.out.print("\n");	
		System.out.print("\n");		
		return sum-a[x][y]; //except the element
	}

}
