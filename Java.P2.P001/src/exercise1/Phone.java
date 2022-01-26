/*
 *
 *
 * @author PhongLe
 * @date Jan 21, 2022
*/
package exercise1;

import java.util.Scanner;

public class Phone {
	private String number;
	public Phone() {
		
	}
	public Phone(String number) {
		super();
		this.number = number;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Phone number: ");
			number = sc.next();
		}while(!checkPhone(number));
		
	}
	public static boolean checkPhone(String phone) {
		
		boolean isNum = false;
		if(phone.length()<10) {
			System.out.println("Phone number must be 10 digit");
			return false;
		}else {
			isNum = phone.matches("[0-9]+[\\.]?[0-9]*");
			if (isNum) {
				return true;
			} else {
				System.out.println("Phone number must is number");
				return false;
			}
		}	
		
	}
}
