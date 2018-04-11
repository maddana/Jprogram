package day4_accesspecifier;//different package

import day4.*;

public class testAccess extends AccessSpecifier
{
		public static void main(String []args) {
		// TODO Auto-generated method stub
		AccessSpecifier ob=new AccessSpecifier();
		//function calls the variable by object reference 
				System.out.println(ob.i1);//public variable
				System.out.println(ob.i2);//protected variable
			//	System.out.println(ob.i3);//default variable
			//	System.out.println(ob.i4);//private variable

		ob.f1();
		ob.f2();
		//ob.f3();
		//ob.f4();
		ob.f5();
		//accessing non static member inside static class will be error,so make it has static variable in its corresponding class
				//function calls the variable directly after inheritance
		/*System.out.println(i1);//public variable
		System.out.println(i2);//protected variable
		System.out.println(i3);//default variable
		System.out.println(i4);//private variable
		f1();
		f2();
		f3();*/

	}
	void tf2()
	{
		//function calls the variable directly after inheritance
		System.out.println(i1);//public variable
		System.out.println(i2);//protected variable
		//System.out.println(i3);//error ,accessing default variable in another class and different package
		//System.out.println(i4);// error, accessing private variable in another class and different package

		f1();
		f2();
		//f3();//error ,accessing default method in another class and different package
		//f4();
		f5();
	}
}
