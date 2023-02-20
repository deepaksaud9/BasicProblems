package coreJavaBasicProblem;

import java.util.Scanner;

public class factorial {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		
	int	count = 1;
//	int number =3;
	
	if(number<0)
	{
		System.out.println("factorial of given negative number "+ number +" is undefined");
		
		
	}else if(number==0) {
		System.out.println("factorial of given number " + number + " is 0" );
	}else{
	
		
		for(int i=1;i<=number;i++)
		{
			count = count*i;
		}
		 System.out.println("factorial of given "+number+ " is =" + count);
		}
	}
		
	}
	

