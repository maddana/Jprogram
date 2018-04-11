package day4;

public class AccessSpecifierMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSpecifier ob=new AccessSpecifier(); 
		System.out.println(ob.i1);
		System.out.println(ob.i2);
		System.out.println(ob.i3);
		//System.out.println(ob.i4);//error ,accessing private variable in another class
		ob.f1();
		ob.f2();
		ob.f3();
		//ob.f4();//error ,accessing private method in another class
		ob.f5();

	}

}
