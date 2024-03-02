package CLASSESOBJECT;
class Book{
	int bookID;
	String bookName;
	double price;
	Book(int bookID,String bookName,double price){
		this.bookID=bookID;
		this.bookName=bookName;
		this.price=price;
	}
	@Override
	public boolean equals(Object obj) {
		Book nob=(Book)obj;
		if(nob.price==this.price) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public String toString() {
		return bookID+" "+bookName+" "+price;
	}
	
}
public class BookDetails {

	public static void main(String[] args) {
		Book ob1=new Book(1234,"Full Stack Java Development",1065.98);
		Book ob2=new Book(1235,"Linear Algebra",1065.98);
		if(ob1.equals(ob2)) {
			System.out.println("Both books prices are same!!");
		}
		else {
			System.out.println("Both books prices are not same!!");
		}
		System.out.println("First object component:"+ob1.toString());
		System.out.println("Second object component:"+ob2.toString());
	}

}
