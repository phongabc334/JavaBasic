/*
 *
 *
 * @author PhongLe
 * @date Jan 14, 2022
*/
package exercise.forloop;

public class SumAverageRunningInt {
	public static void main(String[] args) {
		int sum =0;
		double average;
		int lowerBound =1;
		int upperBound =100;
		
		for(int number=lowerBound;number<=upperBound;++number) {
			sum+= number;
		}
		
		average = sum/upperBound;
		System.out.println("Average of All 100 first numbers " + average);
	}
}
