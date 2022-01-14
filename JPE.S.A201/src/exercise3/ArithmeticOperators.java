/*
 *
 *
 * @author PhongLe
 * @date Jan 13, 2022
*/
package exercise3;

import java.util.Scanner;

public class ArithmeticOperators {
	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second  number: ");
		int b = sc.nextInt();
		System.out.print("Enter third  number: ");
		int c = sc.nextInt();
		System.out.print("Enter fourth  number: ");
		int d = sc.nextInt();
		System.out.print("Enter five  number: ");
		int e = sc.nextInt();
		System.out.println("The sum is : " + (a+b+c+d+e));
	}
}
