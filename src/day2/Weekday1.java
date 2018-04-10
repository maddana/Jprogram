package day2;

public enum Weekday1 {
	sunday("sun","red"),monday("moon","white"),tuesday("mars","red orange"),wednesday("mercury","green"),thursday("jupiter","yello"),friday("venus","white"),saturday("saturn","black");
	String owner,color;
	Weekday1(String s1,String s2)
	{
		owner=s1;
		color=s2;
	}
}
