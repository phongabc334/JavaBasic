/*
 *
 *
 * @author PhongLe
 * @date Jan 17, 2022
*/
package Exercise;

public class Truck extends Car {
	private int weight;
	
	public Truck() {
		super();
	}
	public Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public double getSalePrice() {
		if(weight > 2000) {
			return super.getSalePrice()*0.9;
		}else {
			return super.getSalePrice()*0.8;
		}
		
	}
	@Override
	public String toString() {
		return "Truck ["+super.toString() + " weight=" + weight + " SalePrice="+getSalePrice()+ "]";
	}
	
}
