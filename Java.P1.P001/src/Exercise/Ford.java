/*
 *
 *
 * @author PhongLe
 * @date Jan 17, 2022
*/
package Exercise;

public class Ford extends Car{
	private int year;
	private int mamanufacturerDiscount;
	
	public Ford() {
		super();
	}
	public Ford(int speed, double regularPrice, String color, int year, int mamanufacturerDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.mamanufacturerDiscount = mamanufacturerDiscount;
	}
	public double getSalePrice() {
		return (super.getSalePrice()-mamanufacturerDiscount);
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMamanufacturerDiscount() {
		return mamanufacturerDiscount;
	}
	public void setMamanufacturerDiscount(int mamanufacturerDiscount) {
		this.mamanufacturerDiscount = mamanufacturerDiscount;
	}
	@Override
	public String toString() {
		return "Ford ["+ super.toString()+" year=" + year + ", mamanufacturerDiscount=" + mamanufacturerDiscount + " SalePrice="+getSalePrice()+ "]";
	}
	
	
}
