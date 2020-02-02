package javademo;
interface as
{
	int a=90;
	default void ma()
	{
		System.out.println("default");
	}
	void ka();
}
class bs implements as
{
	int a=20;
	public void ka()
	{ System.out.println("ka");}
	void disp()
	{
		System.out.println(this.a+" "+a);
	}
}
public class Rough 
{
	public static int i=9;
	public static void main(String[] args)
	{
	  System.out.println("Tanmay");
	  i++;
	  System.out.println(i);
	  bs b= new bs();
	  b.disp();
	  b.ma();
	  b.ka();
	}
}
