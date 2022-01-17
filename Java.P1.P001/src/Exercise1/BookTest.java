/*
 *
 *
 * @author PhongLe
 * @date Jan 17, 2022
*/
package Exercise1;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		Book[] book = new Book[30];
		int n;
		System.out.println("How many books do you want to create?");
		n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the book"+i+": \n");
			book[i] = new Book();
			book[i].mutator();
		}
		for(int i=0;i<n;i++) {
			book[i].getBookInfor();
		}
	}

}
