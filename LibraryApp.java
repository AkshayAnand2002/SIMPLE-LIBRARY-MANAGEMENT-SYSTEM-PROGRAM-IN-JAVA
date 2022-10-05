package libapp;

import java.util.ArrayList;

//IT DEPENDS ON BOOKREPOSITORY.
public class LibraryApp {
	private BookRepository bookrepo = new BookRepository();
	public void searchByISBN(String isbn) {
		System.out.printf("SEARCHING FOR BOOKS BY ISBN %s\n",isbn);
		Book book=bookrepo.findByISBN(isbn);
		if(book !=null) {
			System.out.printf("BOOK FOUND:\n\tTITLE:%s\n\tGENRE:%s\n\tAUTHOR:%s",book.getTitle(),book.getgenre(),book.getauthor());
		}
		else {
			System.out.printf("NO BOOKS FOUND");
		}
		System.out.print("\n\n");
	}
	public void searchbytitle(String title) {
		System.out.printf("SEARCHING FOR BOOKS WITH '%s' IN THE TITLE.\n",title);
		ArrayList<Book> books = bookrepo.findbytitle(title);
		System.out.printf("%s BOOKS FOUND%s\n",books.size(),books.size()>0 ? ":" :".");
		for(Book book: books) {
			System.out.printf("BOOK FOUND:\n\tTITLE:%s\n\tGENRE:%s\n\tAUTHOR:%s\n",book.getTitle(),book.getgenre(),book.getauthor());
		}
		System.out.println();
	}
}
