/*
 *
 *
 * @author PhongLe
 * @date Jan 14, 2022
*/
package exercise.whileloop;

public class Fibonacci {
	public static void main(String[] args) {
		int n=1;
		int fnMinus1 = 1;
		int fnMinus2 = 1;
		int nMax = 20;
		int sum = fnMinus1 + fnMinus2;
		double average;
		
		System.out.println("The first " + nMax + " Fibonaci number are:");
		while(n<=nMax) {
			System.out.println(fnMinus1 + " ");
			
			sum = fnMinus1 + fnMinus2;
			fnMinus1 = fnMinus2;
			fnMinus2 = sum;
			++n;
		}
		average = sum/nMax;
		
		System.out.println("\nThe average is " + average);
	}
}
