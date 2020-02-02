package factorymethod;

import java.util.Scanner;

public class GenerateBill {

	public static void main(String[] args) {
		GetPlanFactory plan= new GetPlanFactory();
		System.out.print("Enter the name of plan for which the bill will be generated: ");
		Scanner s= new Scanner(System.in);
		String choice= s.nextLine();
		System.out.print("Enter the number of units for bill will be calculated: ");  
		int unit= Integer.parseInt(s.nextLine());
		
		ElectricBillPlan bill= plan.getPlan(choice);
		System.out.println("Bill amount for "+choice+" of "+unit+" unit is: ");
		bill.getRate();
		bill.calculateBill(unit);
	}

}
