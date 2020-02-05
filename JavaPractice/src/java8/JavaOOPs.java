package java8;

class Animal
{
	Animal()
	{
		System.out.println(" animal con");
	}
	protected void m1() {
		System.out.println("animal m1");
	}
	public void m2() {
		System.out.println("animal m2");
	}
}

class Dog extends Animal
{
	public Dog()
	{
		super.m1();
		System.out.println(" Dog con");
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
		
		Animal a= new Dog();
		a.m1();
		a.m2();
		
		System.out.println("main end");
	}

}
