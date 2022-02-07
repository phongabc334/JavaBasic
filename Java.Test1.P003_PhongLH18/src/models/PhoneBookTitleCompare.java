/*
 *
 *
 * @author PhongLe
 * @date Jan 26, 2022
*/
package models;

import java.util.Comparator;

public class PhoneBookTitleCompare implements Comparator<PhoneBook>{

	@Override
	public int compare(PhoneBook o1, PhoneBook o2) {
		return o1.getName().compareToIgnoreCase(o2.getName());
	}
	
}
