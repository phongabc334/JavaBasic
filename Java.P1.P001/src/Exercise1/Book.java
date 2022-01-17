/*
 *
 *
 * @author PhongLe
 * @date Jan 17, 2022
*/
package Exercise1;

import java.util.Scanner;

public class Book {
	private String nameBook;
	private int ISBN;
	private String author;
	private String publisher;

	public String getNameBook() {
		return nameBook;
	}

	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void mutator() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name Book: ");
		nameBook = sc.next();
		System.out.println("ISBN number:");
		ISBN = sc.nextInt();
		System.out.println("Author name:");
		author = sc.next();
		System.out.println("Publisher: ");
		publisher  = sc.next();
		sc.close();
	}
	public void getBookInfor() {
		System.out.println("BookInfor [nameBook=" + nameBook + ", ISBN=" + ISBN + ", author=" + author + ", publisher=" + publisher
				+ "]");
		
	}
	@Override
	public String toString() {
		return "Book [nameBook=" + nameBook + ", ISBN=" + ISBN + ", author=" + author + ", publisher=" + publisher
				+ "]";
	}
	
}
