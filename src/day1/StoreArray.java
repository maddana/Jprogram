package day1;
import java.util.*;
import java.io.IOException;
import java.util.Arrays;
public class StoreArray 
{
	
	int []a;
	StoreArray()
	{
		a=new int[10];
	}
	StoreArray(int x)
	{
		a=new int[x];
	}
	StoreArray(int x[])
	{
		a=x;
	}
	StoreArray(StoreArray x)
	{
		this.a=x.a;
	}
	void read() throws NumberFormatException,IOException
	{
		System.out.println("enter"+a.length+"elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(read.input.readLine());
		}
	}
	void display()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a+" ");
		}
		System.out.println("");
	}
	void sort1()
	{
		Arrays.sort(a);
	}
	void search(int key)
	{
		sort1();
		int k=Arrays.binarySearch(a,key);
		if(k<0)
		{
			System.out.println("Element not found");
		}
		else
			System.out.println("Element found"+k);
	}
	public static void main(String []args)throws IOException
	{
		
	}
	
	
}
