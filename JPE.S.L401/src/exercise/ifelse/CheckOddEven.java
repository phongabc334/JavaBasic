/*
 *
 *
 * @author PhongLe
 * @date Jan 14, 2022
*/
package exercise.ifelse;

import java.util.Scanner;

public class CheckOddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for number:");
		int number = sc.nextInt();
		System.out.println("The mark is : " + number);
		
		if(number%2==0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd number");
		}
		System.out.println("------------------");
		System.out.println("Bye");
		sc.close();
	}
}
