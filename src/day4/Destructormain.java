package day4;

public class Destructormain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Destructor ob=new Destructor();
		ob.f1();
		Destructor ob1=ob;  // reference for the object ob is created.
		ob=null;
		ob1=null;
		new Destructor().f1();//object created but no place holder to the reference ,So it automatically create object ob1.
		System.gc();// explicitly calling of garbage collector
	}

}
