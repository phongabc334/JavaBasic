/*
 *
 *
 * @author PhongLe
 * @date Jan 21, 2022
*/
package exercise1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Email {
	private String email;

	public Email() {

	}

	public Email(String email) {
		super();
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Email: ");
			email = sc.next();
		} while(!checkEmail(email));
	}

	public static boolean checkEmail(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";

		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		if(pat.matcher(email).matches()) {
			return true;
		}else {
			System.out.println("Email must is correct format");
			return false;
		}
	}
}
