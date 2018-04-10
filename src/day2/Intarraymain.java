package day2;

public class Intarraymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intarray it=new Intarray(new int[]{5,4,3,2,2,4,5});
		it.display();
		Intarray it1=new Intarray(it);
		it1.display();
		it1.duplicate();
		it1.display();
		it.sort();
	}

}
