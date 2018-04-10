package day2;

public class Additionmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix ob=new Matrix();
		ob.read();
		//ob.display();
		Matrix ob2=new Matrix();
		ob2.read();
		Matrix ob3=new Matrix();
		ob3.add(ob, ob2);
		ob3.display();
		ob3.scalar();
	}
}
