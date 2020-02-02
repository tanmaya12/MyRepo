package factorymethod;

public class GetPlanFactory {
	public ElectricBillPlan getPlan(String planType) {
		if (planType==null) {
			return null;
		}
		if (planType.equalsIgnoreCase("domesticplan")) {
			return new DomesticPlan();
		} else if (planType.equalsIgnoreCase("commercialplan")) {
			return new CommercialPlan();
		}
		return null;		
		
	}

}
