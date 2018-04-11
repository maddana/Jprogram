package day4;

public class AccessSpecifier {
	public int i1=10;
	protected static int i2=20;
	int i3=30;
	private int i4=40;
	public void f1()
	{
		System.out.println("I am in f1"+i4);
	}
	protected static void f2()
	{
		System.out.println("I am in f2");
	}
	void f3()
	{
		System.out.println("I am in f3");
	}
	private void f4()
	{
		System.out.println("I am in f4");
	}
	public void f5() //to access private function use public method
	{
		f4();
	}
	public AccessSpecifier()
	{
		System.out.println("I am in constructor.");
	}

}
