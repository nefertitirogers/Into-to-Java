
public class Author {
	
	//instance variables
	
	private String firstName; 
	private String lastName; 
	private int authorBirthYear; 
	private int numOfPublications; 
	
	
	// 
	public Author(){
		this.firstName = ""; 
		this.lastName = "";
		this.authorBirthYear = 0; 
		this.numOfPublications = 0;
		
	}

	
	public Author(Author a){
		this.firstName = a.getFirstName();
		this.lastName = a.getLastName();
		this.authorBirthYear = a.getAuthorBirthYear();
		this.numOfPublications = a.getNumOfPublications();
}

	// Setters 

	public void setFirstName (String nameFirst){
		nameFirst = firstName; } 
	
	public void setLastName (String nameLast){ 
		nameLast = lastName ; 
	}
	
	public void setAuthorBirthYear ( int birthYear) { 
		birthYear = authorBirthYear;
	}
	
	public void setNumOfPublications (int publications) { 
		publications = numOfPublications;
	}
	
	
	// Getters 
	
	public String getFirstName(){ 
		return firstName; 
	}
	
	public String getLastName() { 
		return lastName;
	}
	
	public int getAuthorBirthYear(){ 
		return authorBirthYear;
	}
	
	public int getNumOfPublications() { 
		return numOfPublications; 
	}
	
	}