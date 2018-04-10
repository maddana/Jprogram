package day2;

public class Matrix {
	int arr[][];
	Matrix()
	{
		arr=new int[3][3];
	}
	Matrix(int n)
	{
		arr=new int[n][n];
	}
	Matrix(int n[][])
	{
		arr=n;
	}
	Matrix(Matrix n)
	{
		this.arr=n.arr;
	}
	void read()
	{
		System.out.println("Enter"+arr.length+"elements");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j]=Rmatrix.sc.nextInt();
			}
			
		}
	}
	void display()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
			
		}
	}
	void add(Matrix r1,Matrix r2)
	{
		if(r1.arr.length==r2.arr.length)
		{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				this.arr[i][j]=r1.arr[i][j]+r2.arr[i][j];
			}
			
		}
		}
		else
			System.out.println("Enter valid matrix");
	}
}
