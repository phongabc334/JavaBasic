/*
 *
 *
 * @author PhongLe
 * @date Jan 20, 2022
*/
package Exercise1;

import java.util.Scanner;

public class Triangle extends Shape{
	private double a;
	private double b;
	private double c;
	
	public Triangle() {
		
	}
	
	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	public double getPerimeter() {
		double x = a+b+c;
		return x;
	}
	public double getArea() {
		double p = (a+b+c)/2;
		double x = Math.sqrt((p*(p-a)*(p-b)*(p-c)));
		return x;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Please input side A of Triangle:");
			a = sc.nextDouble();
			System.out.println("Please input side B of Triangle:");
			b = sc.nextDouble();
			System.out.println("Please input side C of Triangle:");
			c = sc.nextDouble();
		} catch (Exception e) {
			System.out.println("Please input number !!!");
		}
		
	}
	public void printResult() {
		System.out.println("-----Triangle-----");
		System.out.println("Side A: "+a);
		System.out.println("Side B: "+b);
		System.out.println("Side C: "+b);
		System.out.println("Area: "+ getArea());
		System.out.println("Perimeter: "+getPerimeter());
	}
}
