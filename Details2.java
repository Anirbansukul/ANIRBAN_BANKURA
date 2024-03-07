package NewClassesandObject;
class Point{
	int x;
	String y;
	Point(int x,String y){
		this.x=x;
		this.y=y;
	}
	Point(int x){
		this.x=x;
	}
	public void setX(int x){
		this.x=x;
		System.out.println(y);
	}
	public void setY(String y){
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public String getY() {
		return y;
	}
}
public class Details2 {

	public static void main(String[] args) {
		Point ob1=new Point(12);
		System.out.println("X value is:"+ob1.getX());
		System.out.println("Y value is:"+ob1.getY());
		ob1.setY("Anirban Sukul");
		System.out.println("After updating:");
		System.out.println("X value is:"+ob1.getX());
		System.out.println("Y value is:"+ob1.getY());
		System.out.println("Another object is:");
		Point ob2=new Point(18,"Anirban Sukul");
		System.out.println("X value is:"+ob2.getX());
		System.out.println("Y value is:"+ob2.getY());
		
	}

}
