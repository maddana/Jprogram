package day1;

public class Nprocess {
	int num;
	public void setData(int a)
	{
		num=a;
	}
	public void checkEvenOdd()
	{
		if(num<0)
			System.out.println( "negative number");
		if(num>9999)
			System.out.println("greater_4");
		if(num%2==0)
			System.out.println("Even");
		else
			System.out.print("odd");
	}
	public String checkAmstrong()
	{
		if(num>0)
		{
			int c=0,a,temp;    
		    temp=num;  
		    while(num>0)  
		    {  
		    a=num%10;  
		    num=num/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    	return "armstrong_number";   
		    else  
		        return "Not_armstrong_number";   
		   } 
		else 
			return "Enter valid number";
		}
	public void isPrime() {
		int count=0;
		for(int i=2; i<num; i++)
		{
		    if(num%i == 0)
		    {
		        count++;
		        break;
		    }
		}
		if(count == 0)
		{
		    System.out.print("This is a Prime Number");
		}
		else
		{
		    System.out.print("This is not a Prime Number");
		}
		}
	}
	
///
//




