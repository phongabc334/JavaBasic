/*
 *
 *
 * @author PhongLe
 * @date Jan 28, 2022
*/
package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	private static final String VALID_EMAIL_REGEX = "^[\\w]{6,}$";
	
	public static boolean isEmail(String email) {
		Pattern pattern = Pattern.compile(VALID_EMAIL_REGEX);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
	public static boolean isGroup(String group) {
		if(group.equalsIgnoreCase("Family") || group.equalsIgnoreCase("Colleague") || group.equalsIgnoreCase("Friend") || group.equalsIgnoreCase("Other")) {
			return true;
		}else {
			return false;
		}
	}
}
