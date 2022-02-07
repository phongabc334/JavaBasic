/*
 *
 *
 * @author PhongLe
 * @date Jan 28, 2022
*/
package main;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import models.PhoneBook;
import services.PhoneBookManagement;
import utils.Validator;

public class main {
	private static List<PhoneBook> listPhoneBook;

	public static void main(String[] args) throws Exception {
		String choise;
		Scanner sc = new Scanner(System.in);
		List<PhoneBook> phoneBookByName;
		PhoneBookManagement bookManagement = new PhoneBookManagement();
		do {
			System.out.println();
			System.out.println("===========MENU=============");
			System.out
					.println("1. Add a new list of phone book\r\n" + "2. Add a new phone number to existed contact\r\n"
							+ "3. Display all contacts in the phone book, sort by name\r\n"
							+ "4. Find phone number list by name\r\n" + "5. Delete contact by name\r\n"
							+ "6. Delete contact by group\r\n" + "7. Close program\r\n" + "");
			System.out.print("Select: ");
			choise = sc.next();
			switch (choise) {
			case "1":
				bookManagement.inputData();
				try {
					bookManagement.save();
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Save fail !");
				}
				break;
			case "2":
				break;
			case "3":
				bookManagement.display();
				break;
			case "4":
				System.out.println("--------- Find phone number list by name ------");
				try {
					System.out.println("Enter name: ");
					String nameSearch = sc.next();
					phoneBookByName = bookManagement.findByName(nameSearch);
					if(phoneBookByName == null) {
						throw new IOException();
					}
					System.out.println("--------- List of PhoneBook -------");
					for(PhoneBook book : phoneBookByName) {
						System.out.println(book.toString());
					}
				} catch (IOException e) {
					System.out.println("No Data!");
				}
				break;
			case "5":
				System.out.println("--------- Delete contact by name -------");
				System.out.println("Enter name: ");
				String namedelete = sc.next();
				try {
					bookManagement.delete(namedelete);
				} catch (Exception e) {
					System.out.println("Remove Fail !");
				}
				break;
			case "6":
				System.out.println("--------- Delete contact by group -------");
				System.out.println("Enter group (Family/Colleague/Friend/Other): ");
				String groupdelete = sc.next();
				try {
					bookManagement.deleteByGroup(groupdelete);
				} catch (Exception e) {
					System.out.println("Remove Fail !");
				}
			case "7":
				System.exit(0);
			default:
				break;
			}
		} while (true);
		
	}
}
