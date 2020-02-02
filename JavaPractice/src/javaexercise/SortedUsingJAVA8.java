package javaexercise;
import java.util.ArrayList;

class Car{
	int no;
	String color;
	String brand;
	public Car(int no,String color,String brand)
	{
		this.no=no;
		this.brand=brand;
		this.color=color;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	@Override
	public String toString()
	{
		return "No=" + no + ", Color=" + color + ", Brand=" + brand ;
	}
}
public class SortedUsingJAVA8 {
	public static void main(String[] args) {
		ArrayList<Car> ar=new ArrayList<>();
		ar.add(new Car(345,"red","Suchiki"));
		ar.add(new Car(35,"black","tata"));
		ar.add(new Car(3450,"purple","maruti"));
		ar.add(new Car(450,"blue","bmw"));
		System.out.println("Sorted by no:");
		ar.stream().sorted((c1,c2)->c1.getNo()-c2.getNo()).forEach(System.out::println);
		System.out.println("Sorted by color:");
		ar.stream().sorted((c1,c2)->c1.getColor().compareTo(c2.getColor())).forEach(System.out::println);
		System.out.println("Sorted by brand:");
		ar.stream().sorted((c1,c2)->c1.getBrand().compareTo(c2.getBrand())).forEach(System.out::println);
	}

}
