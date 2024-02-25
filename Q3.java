package CLASSESOBJECT;
class Panchal<T1,T2,T3,T4,T5>{
	T1 obj1;T2 obj2;T3 obj3;T4 obj4;T5 obj5;
	void setObject1(T1 obj1){
		this.obj1=obj1;
	}
	void setObject2(T2 obj2){
		this.obj2=obj2;
	}
	void setObject3(T3 obj3){
		this.obj3=obj3;
	}
	void setObject4(T4 obj4){
		this.obj4=obj4;
	}
	void setObject5(T5 obj5){
		this.obj5=obj5;
	}
	T1 getObject1() {
		return obj1;
	}
	T2 getObject2() {
		return obj2;
	}
	T3 getObject3() {
		return obj3;
	}
	T4 getObject4() {
		return obj4;
	}
	T5 getObject5() {
		return obj5;
	}
}
public class Q3 {

	public static void main(String[] args) {
		Panchal<String,Integer,Double,Long,String> ob=new Panchal<String,Integer,Double,Long,String>();
ob.setObject1("Panchal High School");
ob.setObject2(125);
ob.setObject3(1200000.5678543);
ob.setObject4((long) 1234321457);
ob.setObject5("I LOVE PANCHAL.");
System.out.println(ob.getObject1());
System.out.println(ob.getObject2());
System.out.println(ob.getObject3());
System.out.println(ob.getObject4());
System.out.println(ob.getObject5());
	}

}
