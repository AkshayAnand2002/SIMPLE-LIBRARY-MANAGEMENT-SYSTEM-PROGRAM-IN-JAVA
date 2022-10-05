package libapp;

import java.util.ArrayList;
//IT DEPENDS ON BOOK.
public class BookRepository {
	private ArrayList<Book> books = new ArrayList<Book>();
	public BookRepository() {
		Book book1=new Book("1","ABC","HORROR",null,"ABC");
		books.add(book1);
		Book book2=new Book("2","DEF","COMEDY",null,"DEF");
		books.add(book2);
		Book book3=new Book("3","AYZ","HISTORICAL",null,"XYZ");
		books.add(book3);
		Book book4=new Book("4","KLM","MATHS",null,"KLM");
		books.add(book4);
		Book book5=new Book("5","PQR","PHYSICS",null,"PQR");
		books.add(book5);
	}
	public Book findByISBN(String isbn) {
		for(Book book:books) {
			if(book.getISBN().equals(isbn)) {
				return book;
			}
		}
		return null;
	}
	public ArrayList<Book> findbytitle(String title) {
		ArrayList<Book> booksfound=new ArrayList<Book>();
		for (Book book:books) {
			if(book.getTitle().toLowerCase().contains(title.toLowerCase())) {
				booksfound.add(book);
			}
		}
		return booksfound;
	}
}
