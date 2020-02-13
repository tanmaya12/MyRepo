package java8;

final class ImmutableClass{
	private final int i;
	private final char ch;
	public ImmutableClass(int i, char ch) {
		super();
		this.i = i;
		this.ch = ch;
	}
	public int getI() {
		return i;
	}
	public char getCh() {
		return ch;
	}	
}

public class ImmutableClassCheck {

	public static void main(String[] args) {
		ImmutableClass o1= new ImmutableClass(3,'t');
		System.out.println(o1.getI());
		System.out.println(o1.getCh());
		System.out.println(o1.hashCode());
		int hashCode = new ImmutableClass(78,'c').hashCode();
		System.out.println(o1.getI());
		System.out.println(hashCode);
	}

}
