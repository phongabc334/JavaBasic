/*
 *
 *
 * @author PhongLe
 * @date Jan 20, 2022
*/
package Exercise1;

import java.util.Scanner;

public class Rectangle extends Shape{
	private double width;
	private double height;

	public Rectangle() {
		
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidtht(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public double getPerimeter() {
		double x = 2*(width+height);
		return x;
	}
	public double getArea() {
		double x = width*height;
		return x;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Please input side width of Rectangle:");
			width = sc.nextDouble();
			System.out.println("Please input length of Rectangle:");
			height = sc.nextDouble();
		} catch (Exception e) {
			System.out.println("Please input number !!!");
		}
		
	}
	public void printResult() {
		System.out.println("-----Rectangle-----");
		System.out.println("Width: "+width);
		System.out.println("Height: "+height);
		System.out.println("Area: "+ getArea());
		System.out.println("Perimeter: "+getPerimeter());
	}
	
}
