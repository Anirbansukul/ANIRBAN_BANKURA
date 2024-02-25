package CLASSESOBJECT;

import java.util.Scanner;

class Student{
	String name;
	int roll;
	Student(String n,int r){
		name=n;
		roll=r;
	}

void display() {
	System.out.println("Name of the Student is:"+name);
	System.out.println("Student roll number is:"+roll);
}
}
public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student s1=new Student("Anirban Sukul",1);
		s1.display();
	}

}

