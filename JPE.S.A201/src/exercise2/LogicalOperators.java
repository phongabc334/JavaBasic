/*
 *
 *
 * @author PhongLe
 * @date Jan 13, 2022
*/
package exercise2;

import java.util.Scanner;

public class LogicalOperators {
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
		if(a==b && a==c && a==d && a==e) {
			System.out.println("Numbers are equal!");
		}else {
			System.out.println("Numbers are not equal!");
		}
	}
}
