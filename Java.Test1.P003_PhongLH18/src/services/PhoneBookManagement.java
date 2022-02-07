/*
 *
 *
 * @author PhongLe
 * @date Jan 28, 2022
*/
package services;

import java.io.*;
import java.util.*;
import models.*;
import utils.Validator;

public class PhoneBookManagement {
	public List<PhoneBook> listOfPhoneBook = new ArrayList<PhoneBook>();
	public void inputData() {
		String loop, name, phoneNumberList, email, address, group;
		PhoneBook phoneBook;
		Scanner sc=  new Scanner(System.in);
		do {
			phoneBook = new PhoneBook();
			System.out.print("Enter Name: ");
			name = sc.next();
			phoneBook.setName(name);
			
			System.out.print("Enter PhoneNumberList: ");
			phoneNumberList = sc.next();
			phoneBook.setPhoneNumberList(phoneNumberList);
			do {
				System.out.print("Enter Email: ");
				email = sc.next();
				if(Validator.isEmail(email)) {
					phoneBook.setEmail(email);
				}else {
					System.out.println("The Email size is minimum 6 characters and no space !");
				}
			}while(!Validator.isEmail(email));
			
			System.out.print("Enter Addredd: ");
			address = sc.next();
			phoneBook.setAddress(address);
			do {
				System.out.print("Enter group (Family/Colleage/Friend/Other): ");
				group = sc.next();
				if(Validator.isGroup(group)) {
					phoneBook.setGroup(group);
				}else {
					System.out.println("The group field accepts one of the following values: \"Family\", \"Colleague\", \"Friend\",\r\n"
							+ "\"Other\"”.");
				}
				
			}while(!Validator.isGroup(group));
			
			
			listOfPhoneBook.add(phoneBook);
			System.out.print("Do you want continue to input course (Y/N)?: ");
			loop = sc.next();
		}while(loop.charAt(0) == 'Y' || loop.charAt(0) == 'y');
	}
	public void save() throws Exception{
		ObjectOutputStream objectOutputStream = null;
		try {
			objectOutputStream = new ObjectOutputStream(new FileOutputStream("phonebook.txt"));
			objectOutputStream.writeObject(listOfPhoneBook);
		} catch (Exception e) {
			throw new Exception();
		}finally {
			if(objectOutputStream != null) {
				objectOutputStream.close();
			}
		}
	}
	@SuppressWarnings("unchecked")
	public List<PhoneBook> findAll() throws Exception{
		ObjectInputStream objectInputStream = null;
		listOfPhoneBook.clear();
		try {
			objectInputStream = new ObjectInputStream(new FileInputStream("phonebook.txt"));
			listOfPhoneBook = (List<PhoneBook>) objectInputStream.readObject();
		} catch (Exception e) {
			throw new Exception();
		}finally {
			if(objectInputStream != null) {
				objectInputStream.close();
			}
		}
		return listOfPhoneBook;
	}
	public void display() {
		Collections.sort(listOfPhoneBook, new PhoneBookTitleCompare());
		System.out.println("=============PHONEBOOK LIST==============");
		for(PhoneBook phoneBook : listOfPhoneBook) {
			System.out.println(phoneBook.toString());
		}
	}
	public List<PhoneBook> findByName(String name) throws Exception{
		List<PhoneBook> books = findAll();
		List<PhoneBook> phoneBooksByName = new ArrayList<PhoneBook>();
		
		if(books != null) {
			for(PhoneBook book : books) {
				if(name.equalsIgnoreCase(book.getName())) {
					phoneBooksByName.add(book);
				}
			}
		}
		return phoneBooksByName;
		
	}
	public void delete(String name) throws Exception {
		boolean removed = false;
		List<PhoneBook> books = findAll();
		if (books == null) {
			throw new IOException();
		}
		Iterator<PhoneBook> iterator = books.iterator();
		while (iterator.hasNext()) {
			PhoneBook book = iterator.next();
			if (name.equalsIgnoreCase(book.getName())) {
				iterator.remove();
				removed = true;
				break;
			}
		}
		if (removed) {
			try {
				ObjectOutputStream objectOutputStream = null;
				try {
					objectOutputStream = new ObjectOutputStream(new FileOutputStream("phonebook.txt"));
					objectOutputStream.writeObject(books);
				} catch (Exception e) {
					throw new Exception();
				}finally {
					if(objectOutputStream != null) {
						objectOutputStream.close();
					}
				}
			} catch (Exception e) {
				throw new Exception();
			}

			System.out.println("Success");
		}else {
			System.out.println("Fail");
		}
		
	}
	public void deleteByGroup(String group) throws Exception {
		boolean removed = false;
		List<PhoneBook> books = findAll();
		if (books == null) {
			throw new IOException();
		}
		Iterator<PhoneBook> iterator = books.iterator();
		while (iterator.hasNext()) {
			PhoneBook book = iterator.next();
			if (group.equalsIgnoreCase(book.getGroup())) {
				iterator.remove();
				removed = true;
				break;
			}
		}
		if (removed) {
			try {
				ObjectOutputStream objectOutputStream = null;
				try {
					objectOutputStream = new ObjectOutputStream(new FileOutputStream("phonebook.txt"));
					objectOutputStream.writeObject(books);
				} catch (Exception e) {
					throw new Exception();
				}finally {
					if(objectOutputStream != null) {
						objectOutputStream.close();
					}
				}
			} catch (Exception e) {
				throw new Exception();
			}

			System.out.println("Success");
		}else {
			System.out.println("Fail");
		}
	}
	public void add(String phone) {
		
	}
}
