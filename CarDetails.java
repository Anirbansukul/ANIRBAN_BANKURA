package CLASSESOBJECT;
class Car{
String model,color;
double speed;
Car(String model,String color,double speed){
	this.model=model;
	this.color=color;
	this.speed=speed;
}
@Override
public boolean equals(Object obj) {
	Car nob=(Car)obj;
	if(nob.speed==this.speed) {
		return true;
	}
	else {
		return false;
	}
}
void printDetails() {
	System.out.println("Your car model is:"+model);
	System.out.println("Your car color is:"+color);
	System.out.println("Your car speed is:"+speed);
}
}
public class CarDetails {

	public static void main(String[] args) {
	Car ob1=new Car("Mercedes Benz S class","White",320.90);
	Car ob2=new Car("Marcedes G-Wagon","Black",326.90);
    if(ob1.equals(ob2)) {
    	System.out.println("Both of the cars speeds are same!!");
    }
    else {
    	System.out.println("Both of the cars speeds are not same!!");
    }
   
   if(ob1.speed>ob2.speed) {
	   System.out.println(ob1.model+" has top speed!!");
	   ob1.printDetails();
   }
   else {
	   System.out.println(ob2.model+" has top speed!!");
	   ob2.printDetails();
   }
	

	}

}
