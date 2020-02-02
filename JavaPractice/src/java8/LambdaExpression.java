package java8;

@FunctionalInterface
interface Lambda1
{
	//void m1();
	int m2(int y);
}
public class LambdaExpression {

	public static void main(String[] args) {
		System.out.println("in main().");
		
		//Lambda1 l= ()-> System.out.println("in lambda().");
		//l.m1();
		//Lambda1 l=(y)->{ System.out.println("in lambda="+y);	return y; };
		Lambda1 l=(y)-> y+13;				
		System.out.println(l.m2(34));
		//Lambda expression only use in functional interface.
	}

}
