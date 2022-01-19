/*
 *
 *
 * @author PhongLe
 * @date 18 thg 1, 2022
*/
package Exercise1;

import java.util.Scanner;

public class ProgramTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chose;
		System.out.println("===============Calculator Program===============");
		System.out.println("1. Normal Calculator");
		System.out.println("2. BMI Calculator");
		System.out.println("3. Exit");
		System.out.print("Please choise one option: ");
		chose = sc.nextInt();
		switch (chose) {
		case 2:
			String weight, height;
			BMI bmi = new BMI();
			System.out.println("-----------BMI Calculator----------");
			do {
				System.out.print("Enter Weight(kg): ");
				weight = sc.next();
				if (bmi.checkIn(weight) == null) {
					System.out.println("BMI is degit");
				}
			} while (bmi.checkIn(weight) == null);
			do {
				System.out.print("Enter Height(cm): ");
				height = sc.next();
				if (bmi.checkIn(height) == null) {
					System.out.println("BMI is degit");
				}
			} while (bmi.checkIn(height) == null);
			double weightx = Double.parseDouble(weight);
			double heightx = Double.parseDouble(height);
			bmi.calculateBMI(weightx, heightx);
			break;
		case 1:
			double a = 0, b = 0, x = 0;
			Calculator cal = new Calculator();
			System.out.println("-----------Normal Calculator----------");
			try {
				System.out.print("Enter number: ");
				a = sc.nextDouble();
			} catch (Exception e) {
				System.out.println("Please input number !");
			} 
			String op;
			do {
				do {
					System.out.print("Enter Operator: ");
					op = sc.next();
				} while (!cal.checkOperator(op));

				if (op.equalsIgnoreCase("=")) {
					break;
				}
				try {
					System.out.println("Enter number: ");
					b = sc.nextDouble();
				} catch (Exception e) {
					System.out.println("Please input number !");
				}
				
				x = cal.calculate(a, op, b);
				System.out.print("Memory: " + x);
				System.out.println();
				a = x;
			} while (!op.equalsIgnoreCase("="));
			System.out.println("Result: " + x);
			break;
		default:
			break;
		}

	}
}
