/*
 *
 *
 * @author PhongLe
 * @date Jan 17, 2022
*/
package Exercise2;

import java.util.Scanner;

public class Employee {
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	public Employee() {
		
	}
	public Employee(String firstName, String lastName, double monthlySalary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		if(monthlySalary < 0) {
			this.monthlySalary = 0;
		}else {
		this.monthlySalary = monthlySalary;
		}
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		if(monthlySalary < 0) {
			this.monthlySalary = 0;
		}else {
		this.monthlySalary = monthlySalary;
		}
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", monthlySalary=" + monthlySalary + "]";
	}
	
}
