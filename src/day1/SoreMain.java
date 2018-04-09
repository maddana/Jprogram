package day1;
import java.util.*;

public class SoreMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StoreArray ob=new StoreArray();
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		sc.close();
	}

}
