package array;

import java.text.DecimalFormat;

public class Decimal6Pos {

	public static void main(String[] args) {
		double d;
		d=(double)22/7;
		System.out.println(d);
		
		//print upto decimal 6 digits
		DecimalFormat df= new DecimalFormat("0.000000");
		String format = df.format(d);
		System.out.println(format);

	}

}
