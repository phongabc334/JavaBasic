package fa.training.entities;

import java.util.Scanner;

import fa.training.utils.Validator;

public class Employee {
	private int id;
	private String employeeName;
	private byte gender;
	private String email;
	private String address;
	private double salary;
	public Employee() {
		
	}
	public Employee(int id, String employeeName, byte gender, String email, String address, double salary) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.gender = gender;
		this.email = email;
		this.address = address;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public byte getGender() {
		return gender;
	}
	public void setGender(byte gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@SuppressWarnings("resource")
	public void input() {
		Scanner sc = new Scanner(System.in);
		boolean status;
		
		do {
			status = false;
			System.out.print("Enter id (number):");
			try {
				id = Integer.parseInt(sc.nextLine());
			}catch (Exception e) {
				status = true;
			}
			
		}while (status);
		
		System.out.print("Enter name:");
		employeeName = sc.nextLine();
		
		do {
			status = false;
			System.out.print("Enter gender (1: male, 0: female):");
			try {
				gender = Byte.parseByte(sc.nextLine());
				status = !(Validator.isGender(gender));
			}catch (Exception e) {
				status = true;
			}
			
		}while (status);
		
		do {
			status = false;
			System.out.print("Enter email (follow email format):");
			try{
				email = sc.nextLine();
				status = !(Validator.isEmail(email));
			}catch (Exception e) {
				status = true;
			}
		}while (status);
		
		System.out.print("Enter address:");
		address = sc.nextLine();
		System.out.print("Enter salary:");
		salary = Double.parseDouble(sc.nextLine());
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", gender=" + gender + ", email=" + email
				+ ", address=" + address + ", salary=" + salary + "]";
	}
	
	
	
	
}
