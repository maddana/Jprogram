package day5;

public class StudentDetails {
	int id;
	String name;
	StudentDetails(int id,String name)
	{
		this.name=name;//this is used for instance variable
		this.id=id;
	}
	public void display()
	{
		System.out.println("ID = "+id+" \nName = "+name);
	}
 class Marks
	{
		int m1,m2,m3;//instance variables
		 Marks(int m1,int m2,int m3)
		{
			this.m1=m1;
			this.m2=m2;
			this.m3=m3;
		}
		public void display1()
		{
			display();
			System.out.println("M1 = "+m1+" \nM2 = "+m2+" \nm3 = "+m3);
		}
	}
}
