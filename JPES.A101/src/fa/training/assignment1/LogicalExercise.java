/*
 *
 *
 * @author PhongLe
 * @date Jan 13, 2022
*/
package fa.training.assignment1;

import java.util.Scanner;

public class LogicalExercise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first integer: ");
		int a = sc.nextInt();
		System.out.print("Input second  integer: ");
		int b = sc.nextInt();
		if(a>b) {
			System.out.println(a + " != "+ b);
			System.out.println(a + " > "+ b);
		}else if(a<b) {
			System.out.println(a + " != "+ b);
			System.out.println(a + " < "+ b);
		}else if(a==b) {
			System.out.println(a + " = "+ b);
		}
	}
}
