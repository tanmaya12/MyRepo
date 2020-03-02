package exception;

class Super{
	Super(){
		System.out.println("super con");
	}
	void m1() throws ArithmeticException
	{
		System.out.println("super");
	}
}
class Sub extends Super
{
	Sub(){
		super();
		System.out.println("sub con");
	}
	@Override
	void m1() throws ArrayIndexOutOfBoundsException
	{
		System.out.println("sub");
	}
	void dis() {
		m1();
		super.m1();
	}
}

public class OverRidden {

	public static void main(String[] args) {
		//Super s= new Sub();
		//s.m1();
		Sub c= new Sub();
		c.dis();
	}

}
