package javaexercise;


class A1
{
	A1()
	{
		System.out.println("A");
	}
}
class B1 extends A1
{
	B1()
	{
		System.out.println("B");
	}
}
class C extends B1
{		
	C()
	{
		System.out.println("C");
	}
}
public class ExceptionEx {
	
	public static void main(String[] args) {
		
		A1 a= new C();
		System.out.println("main");
	}
}
