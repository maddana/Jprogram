package day4_accesspecifier;

import day4.*;

public class testAccess extends AccessSpecifier
{
		public static void main(String []args) {
		// TODO Auto-generated method stub
		AccessSpecifier ob=new AccessSpecifier();
		System.out.println(ob.i1);
		System.out.println(ob.i2);
		//System.out.println(ob.i3);
		//System.out.println(ob.i4);
		ob.f1();
		ob.f2();
		//ob.f3();
		//ob.f4();
		ob.f5();
	}
	void tf2()
	{
		System.out.println(i1);
		System.out.println(i2);
		//System.out.println(i3);
		//System.out.println(i4);
		f1();
		f2();
		//f3();
		//f4();
		f5();
	}
}
