public class Book { 
	
	// instance  variables
	private int numOfPages; 
	private int year; 
	private double priceOfBook; 
	private String title; 
	private Author author;
	
	
	
	public Book(){
		this.numOfPages = 0; 
		this.year = 0; 
		this.priceOfBook = 0.00; 
		this.title = ""; 
		this.author = new Author();
	}
	
	public Book(Book b) {
		this.author = new Author(b.getAuthor());
		this.numOfPages = b.getNumofPages();
		this.year = b.getYear();
		this.priceOfBook = b.getPriceOfBook();
		this.title = b.getTitle();
			
}
	
	    public void setnumOfPages(int pages){ 
	    	pages = numOfPages;
	    }

	    public void setYear(int publicationYear){ 
	    	publicationYear = year;
	    }
	    
	    public void setPrice( double bookPrice){ 
	    	bookPrice = priceOfBook;
	    }
	    
	    public void setTitle (String titleOfBook){ 
	    	titleOfBook = title;
	    	
	    }
	    
	    public void setAuthor (String nameFirst, String nameLast, int birthYear, int publications) { 
	    	author.setFirstName(nameFirst); 
	    	author.setLastName(nameLast); 
	    	author.setAuthorBirthYear(birthYear); 
	    	author.setNumOfPublications(publications);
	    }
	    
	    
	    
	    public int getNumofPages(){ 
	    	return numOfPages; 
	    }
	    
	    public int getYear() { 
	    	return year;
	    }

	    
	    public double getPriceOfBook() { 
	    	return priceOfBook;
	    }
	
	    public String getTitle() { 
	    	return title;
	    }
	    
	    public Author getAuthor() { 
	    	return author;
	    }



	    @Override
		public String toString(){
			return "Title: " +  this.getTitle() + "\nPublished in: " + this.getYear() + 
					"\nNumber of Pages: " + this.getNumofPages() + "\nPrice: $" + this.getPriceOfBook() + 
					"\nWritten by " + author.getFirstName() + " " + author.getLastName() + ", who was born in " 
					+ author.getAuthorBirthYear() + " and has " + author.getNumOfPublications() + " publications"; }







}