package javaexercise;



public class ArrayExcise {

	public static void main(String[] args) {
		
		A a= new A();
		System.out.println(a.add());
		
	}

}
class A
{
	int n=0;
	A()
	{
		add();// n=10
		System.out.println("in A="+n);
	}
	
	int add()
	{
		System.out.println(10*20+"tanmaya"+10+45);return n+=10;}// return time n=20
	
}
class B extends A
{
	B()
	{
		add();
		System.out.println("in B="+n);
	}
	int add()
	{return n+=20;}}
