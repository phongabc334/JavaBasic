package exercise1;

import java.util.Scanner;

public class SumAverageRunningInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		int s = 0;
		int t= 0;
		System.out.println("a : ");
		a = sc.nextInt();
		System.out.println("b : ");
		b = sc.nextInt();
		for(int i=a;i<=b;i++) {
			s+=i;
			t++;
		}
		
		System.out.println("Sum = " + s);
		System.out.println("Average = " + s/t);
	}
}
