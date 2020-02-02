package facade;

public class Iphone implements Mobiles {

	@Override
	public void modelName() {
		System.out.println("Iphone 11 Pro");
	}

	@Override
	public void price() {
		System.out.println("99999.00");
	}

}
