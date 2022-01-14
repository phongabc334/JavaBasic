/*
 *
 *
 * @author PhongLe
 * @date Jan 14, 2022
*/
package exercise.forloop;

/*
 * Write a program called HarmonicSum to compute the sum of a harmonic series, as shown below, 
 * where n=50000. The program shall compute the sum from left-to-right as well as from the 
 * right-to-left. Are the two sums the same? Obtain the absolute difference between these 
 * two sums and explain the difference.
 * */

public class HarmonicSum {
	public static void main(String[] args) {
		int n = 50000;
		double sumLTR = printLeftToRightSum(n);
		double sumPTL = printRightToLeftSum(n);
		System.out.printf("Difference : %.15f",(sumLTR - sumPTL));
		System.out.println();
	}
	/**
	 * Left-to-Right harmonic sum
	 * 
	 */
	private static double printLeftToRightSum(int n) {
		double sum = 0.0;
		for(int i=1; i<=n; i++) {
			sum += (double)1/i;
		}
		System.out.printf("Left-to-Right harmonic sum %.15f", sum);
		System.out.println("");
		return sum;
	}
	
	/**
	 * Right-to-Left harmonic sum
	 */
	private static double printRightToLeftSum(int n) {
		double sum = 0.0;
		for(int i=n; i>=1; i--) {
			sum += (double)1/i;
		}
		System.out.printf("Right-to-Left harmonic sum %.15f", sum);
		System.out.println();
		return sum;
	}
}
