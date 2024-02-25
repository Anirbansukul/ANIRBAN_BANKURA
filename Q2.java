package CLASSESOBJECT;
abstract class Phs{
	public String name;
	public abstract void setname(String n);
	public abstract String getname();
	public  void roll() {
		System.out.println("Student roll number is:"+1);
	}
}
class Anirban extends Phs{

	public void setname(String n) {
		this.name=n;
	}
	public String getname() {
		return this.name;
	}
	public void display() {
		System.out.println("Name of the Student is:"+this.name);
	}
	
}

public class Q2 {

	public static void main(String[] args) {
		Anirban s1=new Anirban();
		s1.setname("Anirban Sukul");
		s1.display();
		//System.out.println("Name of the Student is:"+s1.getname());
		s1.roll();
		

	}

}
