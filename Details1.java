package NewClassesandObject;
class Rectangle{
	private double length;
	private double width;
	Rectangle(double length,double width){
		this.length=length;
		this.width=width;
	}
	Double area() {
		return (length*width);
	}
	public void setLength(double length) {
		this.length=length;
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public double getLength() {
		return this.length;
	}
	public double getWidth() {
		return this.width;
	}
}
public class Details1 {

	public static void main(String[] args) {
		Rectangle ob=new Rectangle(12.5,20.65);
		System.out.println("Area of the rectangle is:"+ob.area());

	}

}
