package day5;

public class BusinessStudent {
		void displayrank(PojoStudent ob)
		{
			if(ob.getMarks()<=35)
			{
				System.out.println(ob.getName()+ " Fail");
			}
			else
			{
				System.out.println(ob.getName()+ " Pass");
			}
		}
}
