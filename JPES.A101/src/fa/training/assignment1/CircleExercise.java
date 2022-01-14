/*
 *
 *
 * @author PhongLe
 * @date Jan 13, 2022
*/
package fa.training.assignment1;

import java.util.Scanner;

public class CircleExercise {
	public static void main(String[] args) {
		double r;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius : ");
		r = sc.nextDouble();
		double n = 3.14159265359;
		System.out.println("Perimeter is = " + (2*r*n));
		System.out.println("Area is = "+ (n*r*r));
	}
}
