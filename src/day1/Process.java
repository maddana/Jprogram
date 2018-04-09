package day1;
import java.util.*;
public class Process {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Nprocess ob=new Nprocess();
		System.out.println("Enter the number ");
		ob.setData(sc.nextInt());
		ob.checkEvenOdd();
//		ob.checkEvenOdd();
		//System.out.println("Given number is="+ob.checkEvenOdd());
		ob.isPrime();
		//System.out.println("Given Number is="+ob.checkPrime());
	}

}
