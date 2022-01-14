/*
 *
 *
 * @author PhongLe
 * @date Jan 13, 2022
*/
package exercise;

public class ArithmeticDemo {
	public static void main(String[] args) {
		int result =1 +2;
		System.out.println("1 + 2 = " + result);
		int original_result = result;
		String firstString = "This is";
		String secondString = " a conatenated string.";
		String thirdString = firstString+secondString;
		System.out.println(thirdString);
		
		result = result - 1;
		System.out.println(original_result + " - 1 = " + result);
		original_result = result;
		
		result = result*2;
		System.out.println(original_result + " * 2 = " + result);
		original_result = result;
		
		result = result / 2;
		System.out.println(original_result + " / 2 = " + result);
		original_result = result;
		
		result = result % 7;
		System.out.println(original_result + " % 7 = " + result);
	}
}
