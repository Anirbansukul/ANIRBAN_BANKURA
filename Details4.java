package NewClassesandObject;
class College{
	String collegeName;
	String collegeLoc;
	College(String collegeName,String collegeLoc){
		this.collegeName=collegeName;
		this.collegeLoc=collegeLoc;
	}
	public void displayStudentInfo() {
		System.out.println("The name of the college where he/she was enrolled:"+this.collegeName);
		System.out.println("College name is:"+this.collegeLoc);
		
	}
}
class Student extends College{
	int studentId;
	String studentName;
	String reference;
	
	Student(String collegeName, String collegeLoc,int studentId,String studentName,String reference) {
		super(collegeName, collegeLoc);
		this.studentId=studentId;
		this.studentName=studentName;
		this.reference=reference;
	}
	public void displayStudentInfo() {
		System.out.println("Name of the student is:"+studentName);
		System.out.println("Student ID is:"+studentId);
		System.out.println("Student reference is:"+reference);
		System.out.println("The name of the college where he/she was enrolled:"+this.collegeName);
		System.out.println("College name is:"+this.collegeLoc);
	}
}
public class Details4 {

	public static void main(String[] args) {
		Student ob1=new Student("Siksha 'o' Anusandhan(Deemed to be University)","Bhubaneswar",9571,"Anirban sukul","West Bengal");
ob1.displayStudentInfo();
System.out.println("------------------------------------------------------------------------");
Student ob2=new Student("Techno University","Kolkata",2341,"Mohor Mukherjee","West Bengal");
ob2.displayStudentInfo();
System.out.println("College objects---------------------------------------------------------");
College ob3=new College("Siksha 'o' Anusandhan(Deemed to be University)","Bhubaneswar");
ob3.displayStudentInfo();
System.out.println("------------------------------------------------------------------------");
College ob4=new College("Techno University","Kolkata");
ob4.displayStudentInfo();

}

}
