package libapp;
//IT DEPENDS ON LIBRARYAPP.
public class Main {

	public static void main(String[] args) {
		LibraryApp app = new LibraryApp();
		app.searchByISBN("1");
		app.searchByISBN("2");
		app.searchByISBN("3");
		app.searchByISBN("100");//not present in bookrepository.
		app.searchbytitle("A");
		app.searchbytitle("s");
	}

}
