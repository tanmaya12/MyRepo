package factorymethod;

public class CommercialPlan extends ElectricBillPlan {

	@Override
	void getRate() {
		rate=7.5;
	}

}