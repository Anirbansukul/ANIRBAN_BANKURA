package NewClassesandObject;
abstract class LibraryResource{
	String title,author;
	LibraryResource(String title,String author){
		this.title=title;
		this.author=author;
	}
	void setTitle(String title) {
		this.title=title;
	}
	void setAuthor(String author) {
		this.author=author;
	}
	String getTitle() {
		return title;
	}
	String getAuthor() {
		return author;
	}
	abstract void displayDetails();
}
class Book extends LibraryResource{
    int pageCount;
	Book(String title, String author,int pageCount) {
		super(title, author);
		this.pageCount=pageCount;
	}
	void setpageCount(int pageCount) {
		this.pageCount=pageCount;
	}
	int getpageCount() {
		return pageCount;
	}

	@Override
	void displayDetails() {
		System.out.println("Book title is:"+this.title);
		System.out.println("Book author is:"+this.author);
		System.out.println("Total book page is:"+this.pageCount);
		
	}
	
}
class Magazine extends LibraryResource{
	String issueDate;
	Magazine(String title, String author,String issueDate) {
		super(title, author);
		this.issueDate=issueDate;
	}
	void setissueDate(String issueDate) {
		this.issueDate=issueDate;
	}
	String getissueDate() {
		return issueDate;
	}
	@Override
	void displayDetails() {
		System.out.println("Book title is:"+this.title);
		System.out.println("Book author is:"+this.author);
		System.out.println("Book issue date is:"+this.issueDate);
		
	}
	
}
class DVD extends LibraryResource{
String duration;
	DVD(String title, String author,String duration) {
		super(title, author);
		this.duration=duration;
	}
	void setDuration(String duration) {
		this.duration=duration;
	}
	String getDuration() {
		return duration;
	}
	@Override
	void displayDetails() {
		System.out.println("Book title is:"+this.title);
		System.out.println("Book author is:"+this.author);
		System.out.println("Duration of the DVD player is:"+this.duration);
		
	}
	
}
public class Details5 {

	public static void main(String[] args) {
		Book ob1=new Book("Full Stack Java Development","Mayur Ramgir",1200);
		ob1.displayDetails();
		System.out.println("----------------------------------------------------------------");
		Magazine ob2=new Magazine("Full Stack Java Development","Mayur Ramgir","14/03/2024");
		ob2.displayDetails();
		System.out.println("----------------------------------------------------------------");
		DVD ob3=new DVD("Full Stack Java Development","Mayur Ramgir","8.5h");
		ob3.displayDetails();
		
		

	}

}
