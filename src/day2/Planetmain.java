package day2;
import java.util.*;
public class Planetmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Planet ob;
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		ob=Planet.valueOf(st);
		System.out.println(ob);
		System.out.println(ob.volume+" g/cm3");
		System.out.println(ob.seconds+" seconds");
		sc.close();
	}
	
}
