package facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jdk.nashorn.internal.ir.WhileNode;

public class FacadePatternUsedClient {
	private static int choice;
	
	public static void main(String[] args) {
		do {
			System.out.print("========= Mobile Shop ============ \n");  
            System.out.print("            1. IPHONE.   \n");  
            System.out.print("            2. SAMSUNG.  \n");  
            System.out.print("            3. ASUS.     \n");  
            System.out.print("            4. Exit.     \n");  
            System.out.print("Enter your choice: "); 
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
            try {
				choice=Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}  
            
            MobileRetailer mob= new MobileRetailer();
            
            switch (choice) {
			case 1:
				mob.iphoneSale();
				break;
			case 2:
				mob.samsungSale();
				break;
			case 3:
				mob.asusSale();
				break;
			
			default:
				System.out.println("Nothing purchased");
				//return;
				System.exit(0);
			}
            
			
		} while (choice!=4);
	}
}
