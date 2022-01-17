/*
 *
 *
 * @author PhongLe
 * @date Jan 17, 2022
*/
package Exercise;

public class Sedan extends Car{

	private int length;

	public Sedan() {
		super();
	}

	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}
	
	public double getSalePrice() {
		if(length > 20) {
			return super.getSalePrice()*0.95;
		}else {
			return super.getSalePrice()*0.9;
		}
		
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Sedan ["+super.toString()+" length=" + length +  " SalePrice="+getSalePrice()+ "]";
	}
	
	
	
}
