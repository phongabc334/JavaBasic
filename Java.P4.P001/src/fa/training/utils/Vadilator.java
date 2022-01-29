package fa.training.utils;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vadilator {
	private static final String VALID_FIXEDWING_ID_REGEX = "FW\\d{5}";
	private static final String VALID_HELICOPTER_ID_REGEX = "RW\\d{5}";
	private static final String VALID_AIRPORT_ID_REGEX = "AP\\d{5}";
	private static final String MODEL_SIZE = "\\w{0,40}";
	private static Set<String> ids = new HashSet<String>();
	
	public static boolean isFixedwingId(String id) {
		Pattern pattern = Pattern.compile(VALID_FIXEDWING_ID_REGEX);
		Matcher matcher = pattern.matcher(id);
		return matcher.matches();
	}
	public static boolean isHelicopterId(String id) {
		Pattern pattern = Pattern.compile(VALID_HELICOPTER_ID_REGEX);
		Matcher matcher = pattern.matcher(id);
		return matcher.matches();
	}
	public static boolean isAirportId(String id) {
		Pattern pattern = Pattern.compile(VALID_AIRPORT_ID_REGEX);
		Matcher matcher = pattern.matcher(id);
		return matcher.matches();
	}
	public static boolean isModel(String model) {
		Pattern pattern = Pattern.compile(MODEL_SIZE);
		Matcher matcher = pattern.matcher(model);
		return matcher.matches();
	}
	public static boolean isFixedwing(String type) {
		if(type.equalsIgnoreCase("VAG")) {
			return true;
		}else if(type.equalsIgnoreCase("LGR")) {
			return true;
		}else if(type.equalsIgnoreCase("PRV")) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isExistsed(String id) {
		if(!ids.contains(id)) {
			ids.add(id);
			return true;
		}else {
			return false;
		}
	}
	public static Set<String> getIds(){
		return ids;
	}
}
