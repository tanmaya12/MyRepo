package javaexercise;

public class SuperKW {

	public static void main(String[] args) 
	{
		A6 b = new B6();
		b.m();
	}

}

class A6
{
	int a=10;
	void m()
	{
		System.out.println("in A");
	}
}
class B6 extends A6
{
	@Override
	void m()
	{
		super.m();
		System.out.println("in B");
		System.out.println(super.a);
	}
}
