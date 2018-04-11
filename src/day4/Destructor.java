package day4;

public class Destructor {
	public Destructor()
	{
		System.out.println("I am in Constructor.");
	}
	public void f1()
	{
		System.out.println("I am IN Function");
	}
	public void finalize()
	{
		System.out.println("I am DEstructor");
	}

}
