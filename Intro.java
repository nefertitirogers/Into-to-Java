
public class Intro {
	
	public static void main (String[] args){
		
		Book book = new Book();
		book.setTitle("Harry Potter and the Goblet of Fire");
		book.setPrice(12.99);
		book.setYear(2000);
		book.setnumOfPages(734);
		book.setAuthor("J.K.", "Rowling", 1965, 7);
		System.out.println(book.toString());
		System.out.println();
		
		
		Book book2 = new Book(book);
		System.out.println(book2.toString());
		System.out.println();
		
		// Incrementing the number of publications of the book copy.
		book2.getAuthor().setNumOfPublications(book2.getAuthor().getNumOfPublications() + 1);
		
		// Printing out the string with the updated value for number of publications.
		System.out.println(book2.toString());
		System.out.println();
		
		// Printing out the string and making sure that the old number of publications wasn't updated.
		System.out.println(book.toString());
		System.out.println();
		
	}

}
