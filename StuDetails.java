package CLASSESOBJECT;
class S1{
	String name;
	int rollno;
	int age;
	void setName(String name) {
		this.name=name;
	}
	void setRoll(int roll) {
		this.rollno=roll;
	}
	void setAge(int age) {
		this.age=age;
	}
	String getName() {
		return name;
	}
	int getRoll() {
		return rollno;
	}
	int getAge() {
		return age;
	}
}
public class StuDetails {

	public static void main(String[] args) {
		S1 ob=new S1();
		ob.setName("Anirban Sukul");
		ob.setRoll(1);
		ob.setAge(18);
		System.out.println("Name of the student is:"+ob.getName()+"\n"+"Roll number of the student is:"+ob.getRoll()+"\n"+"Age of the student is:"+ob.getAge());

	}

}
