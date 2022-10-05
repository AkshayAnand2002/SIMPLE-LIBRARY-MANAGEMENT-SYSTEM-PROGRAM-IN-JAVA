package libapp;
//IT STORES REQUIRED THINGS.
public class Book {
	private String isbn;
	private String title;
	private String genre;
	private String description;
	private String author;

	public Book(String isbn,String title,String genre,String description,String author) {
		this.isbn=isbn;
		this.title=title;
		this.genre=genre;
		this.description=description;
		this.author=author;
	}
	public String getISBN() {
		return isbn;
	}
	public String getTitle() {
		return title;
	}
	public String getgenre() {
		return genre;
	}
	public String getdescription() {
		return description;
	}
	public String getauthor() {
		return author;
	}
}
