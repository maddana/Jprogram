package day5;

public class StudentDetailsMain {
	public static void main(String []args)
	{
		StudentDetails ob=new StudentDetails(12, "King Kong");
		StudentDetails.Marks sm=ob.new Marks(10,20,30);
		System.out.println(ob.id);
		//System.out.println(ob.m1);
		//System.out.println(sm.id);
		System.out.println(sm.m1);
		ob.display();
		sm.display1();
	}

}
