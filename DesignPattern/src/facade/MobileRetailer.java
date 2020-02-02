package facade;

public class MobileRetailer {
	private Mobiles iphone;
	private Mobiles samsung;
	private Mobiles asus;
	
	public MobileRetailer() {
		iphone = new Iphone();
		samsung = new Samsung();
		asus = new Asus();
	}
	public void iphoneSale()
	{
		iphone.modelName();
		iphone.price();
	}
	public void samsungSale()
	{
		samsung.modelName();
		samsung.price();
	}
	public void asusSale() {
		asus.modelName();
		asus.price();
	}
	

}
