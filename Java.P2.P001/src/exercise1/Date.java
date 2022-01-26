/*
 *
 *
 * @author PhongLe
 * @date Jan 21, 2022
*/
package exercise1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Date {
	private String date;
	public Date() {
		
	}
	public Date(String date) {
		super();
		this.date = date;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		do{
			System.out.print("Date: ");
			date = sc.next();
		}while(!checkDate(date));
		
	}
	public static boolean checkDate(String date) {
		String dateRegex = "^([0-9]{2})*/"+"([0-9]{2})*/"+"([0-9]{4})$";

		Pattern pat = Pattern.compile(dateRegex);
		if (date == null)
			return false;
		if(pat.matcher(date).matches()) {
			return true;
		}else {
			System.out.println("Date must is correct format");
			return false;
		}
	}
}
