package javafifty;

public class ArmstrongNo 
{
	public static void main(String[] args)
	{
		int n=153;//1,153, 370, 371, 407, 1634, 8208, 9474, 54748
		int actno=n;
		int sum=0,no;
		while (n>0) 
		{
			no=n%10;
			sum=sum+ no*no*no;
			n=n/10;
		}
		if (sum==actno) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}

	}
}
