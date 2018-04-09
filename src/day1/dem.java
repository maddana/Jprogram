package day1;

public class dem {
	void f1()
	{
		System.out.println("i am in f1");
	}
	dem(int e){
		System.out.println(e);
	}
	dem(){
		this(2);
		System.out.println("i am in 0 arg constructor");
	}
}
