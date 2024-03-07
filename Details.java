package NewClassesandObject;
class Car{
	private String make;
	private String model;
	Car(String make,String model){
		this.make=make;
		this.model=model;
	}
	public void setMake(String make) {
		this.make=make;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public String getMake() {
		return this.make;
	}
	public String getModel() {
		return this.model;
	}
}
class CarTester extends Car{
String make1,model1;
	CarTester(String make, String model) {
		super(make, model);
		this.make1=make;
		this.model1=model;
	}
	
}
public class Details {

	public static void main(String[] args) {
		CarTester myCar1=new CarTester("Offroading","Defender");
		System.out.println("Car is make for:"+myCar1.getMake());
		System.out.println("Car model is:"+myCar1.getModel());
		CarTester myCar2=new CarTester(null,null);
		System.out.println("Car is make for:"+myCar2.getMake());
		System.out.println("Car model is:"+myCar2.getModel());
		//Now we insert the values in myCar2 object
        myCar2.setMake("Racing");
        myCar2.setModel("Ferarri");
        System.out.println("After applying set method the output is:");
        System.out.println("Car is make for:"+myCar2.getMake());
		System.out.println("Car model is:"+myCar2.getModel());
	}

}
