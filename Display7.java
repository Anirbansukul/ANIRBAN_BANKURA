package NewClassesandObject;
interface Vehicle{
	abstract void accelerate();
	abstract void brake();
}
class Rca implements Vehicle{

	@Override
	public void accelerate() {
System.out.println("You should accelerate when you see the clear roads!!");	
	}

	@Override
	public void brake() {
		System.out.println("When you see the traffic or any type of obstracts then you need to press break!!");
	}
	
}
class Bicycle implements Vehicle{

	@Override
	public void accelerate() {
System.out.println("You should paddle when you see the clear roads!!");	
	}

	@Override
	public void brake() {
		System.out.println("When you see the traffic or any type of obstracts then you need to press break!!");
	}
	
}
public class Display7 {

	public static void main(String[] args) {
		System.out.println("For car:");
		Rca ob1=new Rca();
		ob1.accelerate();
		ob1.brake();
		System.out.println("-----------------------------------------------------------");
		System.out.println("For bicycle:");
		Bicycle ob2=new Bicycle();
		ob2.accelerate();
		ob2.brake();

	}

}
