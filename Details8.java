package NewClassesandObject;

import java.util.Scanner;

interface EnrollmentSystem{
	abstract void enrollment();
	abstract void dropping();
}

abstract class Enrollment implements EnrollmentSystem{
   String course1,course2;
	Enrollment(String course1,String course2){
		this.course1=course1;
		this.course2=course2;
	}
	@Override
	public void enrollment() {
		return;
	}

	@Override
	public void dropping() {
		return;
		
	}
	
}
class St extends Enrollment {
	public String StudentName;
	int age;
	public double TotalMark;
	St(String course1, String course2,String StudentName,int age,double TotalMark) {
		super(course1, course2);
		this.StudentName=StudentName;
		this.age=age;
		this.TotalMark=TotalMark;
	}
	public void enrollment() {
		if(this.age>=18&&this.age<35&&(this.TotalMark>=400&&this.TotalMark<=500)){
			System.out.println("You are alloted with:"+this.course2);
		}
		else if(this.age>=18&&this.age<35&&(this.TotalMark>=300&&this.TotalMark<400)){
			System.out.println("You are alloted with:"+this.course1);
		}
		else {
			System.out.println("You can take drop for a year!!");
		}
	}

}

public class Details8 {

	public static void main(String[] args) {
		St ob=new St("IT","CSE","Anirban Sukul",18,299);
		ob.enrollment();

	}

}
