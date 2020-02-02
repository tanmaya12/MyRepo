package javademo;

public class AmstrongNumber 
{
	public static void main(String[] args)
	{
		int no=153;//1x1x1 + 5x5x5 + 3x3x3
		int original, remainder,result=0;
		original=no;
		while (original!=0) 
		{
			remainder= original % 10;
			result += Math.pow(remainder, 3);
			original /=10;
		}
		if (result==no) {
			System.out.println(no+" is Amstrong no.");			
		} else {
			System.out.println(no+" is not Amstrong no.");
		}	
		
	}
}
