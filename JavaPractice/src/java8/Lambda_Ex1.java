package java8;

@FunctionalInterface
interface Lambda
{
	void m1(int i);
}

public class Lambda_Ex1 {
	public static void main(String[] args) {
		int i=5;
		System.out.println(i++);
		
		Lambda l= (a)-> { //
			//i++; //Local variable i can't use in lambda functions varible
			a=7;
			System.out.println(a);
		};
		
		i+=9;
		System.out.println(i);
		
		
	}

}
