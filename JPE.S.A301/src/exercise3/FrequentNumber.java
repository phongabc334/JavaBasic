package exercise3;

import java.util.ArrayList;
import java.util.Scanner;

public class FrequentNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length array : ");
		int n = sc.nextInt();
		int[] intArray = new int[n];
		for (int i = 0; i < intArray.length; i++) {
			if (i < 5) {
				System.out.print("Enter intArray[" + i + "] = ");
				intArray[i] = sc.nextInt();
			} else {
				String len;
				System.out.print("Do you want to continue?(Y/N)");
				len = sc.next();
				if (len.equalsIgnoreCase("Y")) {
					System.out.print("Enter intArray[" + i + "] = ");
					intArray[i] = sc.nextInt();
				} else {
					break;
				}
			}
		}
		System.out.print("Enter value : ");
		int value = sc.nextInt();
		int d = 0;
		ArrayList<Integer> len = new ArrayList<>();
		for (int j = 0; j < intArray.length; j++) {
			if (value == intArray[j]) {
				d++;
				len.add(j);
			}
		}
		System.out.println("Amount of frequence: " + d);
		System.out.print("Indexs : ");
		for (int i = 0; i < len.size(); i++) {
			System.out.print(len.get(i));
		}

	}
}
