import java.util.*;
class Book{
   String title;
   String publicationYear;
   Book(String title,String publicationYear)
   {
       this.title=title;
	   this.publicationYear=publicationYear;
   }
}
class Author extends Book{
    String name;
	String bio;
    public Author(String title,String publicationYear,String name,String bio )
	{
	    super(title,publicationYear);
		this.name=name;
		this.bio=bio;
	}
	public void displayInfo()
	{
	    System.out.println(this.title);
		System.out.println(this.name);
		System.out.println(this.publicationYear);
		
	}
}
public class LibraryManagement{
     public static void main(String[] args)
	 {
	     Author author=new Author("Doraemon","2000","Ashish Singh","Software engineer");
		 author.displayInfo();
		 
	 }
}
