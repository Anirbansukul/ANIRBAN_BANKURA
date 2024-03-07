package NewClassesandObject;
class Laptop{
	private String model;
	private double price;
//	Laptop(String model,double price){
//		this.model=model;
//		this.price=price;
//	}
	public void setModel(String model) {
		this.model=model;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public String getModel() {
		return this.model;
	}
	public double getPrice() {
		return this.price;
	}
	@Override
	public String toString() {
		return "Laptop model is:"+model+"\n"+"Laptop price is:"+price;
	}
}
public class Details3 {

	public static void main(String[] args) {
		Laptop ob=new Laptop();
		ob.setModel("HP core i5(8/512)");
		ob.setPrice(52000.987);
		System.out.println(ob.toString());

	}

}
