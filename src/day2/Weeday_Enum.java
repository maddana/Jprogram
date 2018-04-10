package day2;

public class Weeday_Enum {
	public static void main(String []args)
	{
	Weekday1 ob;
	ob=Weekday1.valueOf("sunday");
	System.out.println(ob);
	System.out.println(ob.owner);
	System.out.println(ob.color);
	ob=Weekday1.valueOf("tuesday");
	System.out.println(ob);
	System.out.println(ob.owner);
	System.out.println(ob.color);
	}
}
