package java8;
//sum of digits of a number divisible by same number
public class SumOfDigits {

	public static void main(String[] args) {
		int n=9,i,sum=0;
		
		for (i = n+1; i < 500; i++) {
			sum=0;
			if (i%n==0) {
				sum=(int)sumOfDigit(i);
				
				if(sum==n) {
					System.out.println(i); break;
				}
			}			
		}
		
	}
	
	static long sumOfDigit(int num) {		
		long sum=0;
		while(num!=0) {
			sum=sum+ (num%10);
			num/=10;
		}
		return sum;
	}

}
