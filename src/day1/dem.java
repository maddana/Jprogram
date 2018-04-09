package day1;

public class dem {
	void f1()
	{
		System.out.println("i am in f1");
	}
	dem(int e){
		System.out.println(e);
	}
	/*A constructor can't be a
	 * static but it can be private
	 */
	dem(){
		this(2);
		System.out.println("i am in 0 arg constructor");
	}
	{
		System.out.println("i am in 1 annonymous block");
		f1();
	}
	static
	{
		System.out.println("i am in 2 annonymous block");
	}
	/*Static can be executed only once
	 * before calling methods all constructor should be executed
	 */
}
