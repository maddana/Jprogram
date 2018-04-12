package day5;

public class Business2 {
	public void displayrank(pojo2 ob)
	{
		if(ob.getmarks()<35)
		{
			System.out.println(ob.getName()+" Fail");
		}
		else
		{
			System.out.println(ob.getName()+" Pass");
		}
	}


}
