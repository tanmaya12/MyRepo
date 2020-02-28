package java8;

class Animal
{ int x=120, y=130;
	Animal()
	{
		System.out.println(" animal con "+x+y);
	}
	Animal(int x, int y)
	{
		this.x=x;
		this.y=y;
		
		System.out.println(" animal para-con");
	}
	protected void m1() {
		System.out.println("animal m1 "+ (x+y));
	}
	public void m2() {
		System.out.println("animal m2");
	}
}

class Dog extends Animal
{
	int a, b;
	public Dog()
	{
		super.m1();
		this.x=a;
		System.out.println(" Dog con "+a);
	}
	
	@Override
	public void m1() {
		System.out.println("dog m1");
	}
	
	@Override
	public void m2() {
		System.out.println("dog m2");
	}
}

public class JavaOOPs {

	public static void main(String[] args) {
		System.out.println("main start");
		
		Dog a= new Dog();
		//Animal a= new Animal(10,20);
		a.m1();
		a.m2();
		
		System.out.println("main end");
	}

}
