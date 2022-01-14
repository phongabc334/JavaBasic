/*
 *
 *
 * @author PhongLe
 * @date Jan 13, 2022
*/
package exercise4;

import java.util.Scanner;

public class CylinderComputation {
	public static void main(String[] args) {
		double radius,height,surfaceArea,baseArea,volume;
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter radius : ");
		radius = sc.nextFloat();
		System.out.println("Enter height : ");
		height = sc.nextFloat();
		double n = 3.14159265359;
		surfaceArea = 2*n*radius*height;
		System.out.println("surfaceArea : " + surfaceArea);
		baseArea = 2*n*radius*(radius+height);
		System.out.println("baseArea : " + baseArea);
		volume = n*radius*radius*height;
		System.out.println("volume : "+volume);
	}
}
