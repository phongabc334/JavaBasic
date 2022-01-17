/*
 *
 *
 * @author PhongLe
 * @date Jan 17, 2022
*/
package Exercise2;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee em1 = new Employee("Phong","Le",2000);
		Employee em2 = new Employee();
		em2.setFirstName("Hihi");
		em2.setLastName("haha");
		em2.setMonthlySalary(-100.0);
		System.out.println(em1.toString());
		System.out.println(em2.toString());
		System.out.println("Yearly salary :");
		System.out.println(em1.getFirstName() + ": "+em1.getMonthlySalary()*12);
		System.out.println(em2.getFirstName() + ": "+em2.getMonthlySalary()*12);
		System.out.println("Yearly salary after 10% raise :");
		System.out.println(em1.getFirstName() + ": "+(em1.getMonthlySalary()*12 + em1.getMonthlySalary()*1.2));
		System.out.println(em2.getFirstName() + ": "+(em2.getMonthlySalary()*12 + em2.getMonthlySalary()*1.2));
	}
}
