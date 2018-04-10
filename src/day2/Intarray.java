package day2;

import java.util.Arrays;

public class Intarray {
	int arr[];
	Intarray()
	{
		arr=new int[10];
	}
	Intarray(int n)
	{
		arr=new int[n];
	}
	Intarray(int n[])
	{
		arr=n;
	}
	Intarray(Intarray n)//copy constructor
	{
		this.arr=n.arr;
	}
	void Read()
	{
		System.out.println("Enter the "+arr.length+"elements");
		for(int i=0;i<arr.length;i++)
		{
			/* 1st case if(i=10)
			 * 			break;//valid
			 */
			arr[i]=Read.sc.nextInt();//if use break it is core unreachable error to avoid this there are tow cases.
			/* 2nd case using break after
			 * the core reached.
			 */
		}
	}
	void display()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	void sort()
	{
		Arrays.sort(arr);
	}
	void search(int n)
	{
		int key=n;
		int temp[]=arr;//copy of array is taken
		Arrays.sort(temp);
		key=Arrays.binarySearch(temp,key);
		if(key<0)
			System.out.println("Not Found");
		else
			System.out.println("Found");
	}
	void duplicate()
	{
		int x=0;
		int temp[]=new int[arr.length];//copy of array is taken
		int temp1[]=new int[arr.length];
		for(int i=0;i<arr.length;i++){
		Arrays.sort(temp);
		int k=Arrays.binarySearch(temp, arr[i]);
		if(k<0)
		{
			temp[x]=arr[i];
			temp1[x++]=arr[i];
		}
		}
		arr=temp1;
		
	}

}
