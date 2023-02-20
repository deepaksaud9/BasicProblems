package coreJavaBasicProblem;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int input1 = sc.nextInt();
		
		System.out.println("enter Second Number");
		int input2 = sc.nextInt();
		
		int result = Add(input1, input2);
		
		System.out.println("the sum of "+input1 + " and "+input2+" = "+ result );
		
	}
	
		public static int Add(int a,int b)
		{
			int sum = a+b;
			return sum;
		}
}
