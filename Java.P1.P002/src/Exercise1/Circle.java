/*
 *
 *
 * @author PhongLe
 * @date Jan 20, 2022
*/
package Exercise1;

import java.util.Scanner;

public class Circle extends Shape {
	private double radius;
	private double pi = 3.14159265359;
	public Circle() {
		
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getPerimeter() {
		double x = 2*radius*pi;
		return x;
	}
	public double getArea() {
		double x = radius*radius*pi;
		return x;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Please input radius of Circle:");
			radius = sc.nextDouble();
		} catch (Exception e) {
			System.out.println("Please input number !!!");
		}
		
	}
	public void printResult() {
		System.out.println("-----Circle-----");
		System.out.println("Radius: "+radius);
		System.out.println("Area: "+ getArea());
		System.out.println("Perimeter: "+getPerimeter());
	}
}
