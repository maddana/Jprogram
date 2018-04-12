package day5;

public class MainPojoBusiness {
	public static void main(String []args)
	{
		PojoStudent ob=new PojoStudent();
		BusinessStudent ob1=new BusinessStudent();
		ob.setName("rajesh");
		ob.setAge(24);
		ob.setMarks(90);
		ob1.displayrank(ob);
	}

}
