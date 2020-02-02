package factorymethod;

public class DomesticPlan extends ElectricBillPlan {

	@Override
	void getRate() {
		rate=3.5;
	}

}
