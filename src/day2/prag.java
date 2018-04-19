package day2;

import java.util.*; 
public class prag { 
	public static void main(String args[]) { 
		Scanner s=new Scanner(System.in); 
		
		System.out.println("Enter the marks"); 
		int a=s.nextInt(); 
		if( a==100 ) { 
			System.out.println("The student obtained a S grade"); 
			}
		if( a>90 && a<100 ) { 
			System.out.println("The student obtained a A grade");
			} 
		if( a>80 && a<=90 ) {
			System.out.println("The student obtained a B grade"); 
			}
		if( a>70 && a<=80 ) { 
			System.out.println("The student obtained a C grade");
			} if( a>60 && a<=70 ) 
			{ 
				System.out.println("The student obtained a D grade");
				} 
			if( a>=50 && a<=60 ) { 
				System.out.println("The student obtained a E grade"); 
				}
if( a<50 ) {
	System.out.println("The student obtained a F grade"); 
	} 
if( a>100 ) 
{ System.out.println("Invalid Input");
} 
} 
	}

