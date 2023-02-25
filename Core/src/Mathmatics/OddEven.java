package Mathmatics;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		findOddEven(num);
		
	}
	
	public static void findOddEven(int number)
	{
		if(number%2 == 0)
		{
			System.out.println("this is a even number");
		}else {
			System.out.println("this is a odd number");
		}
	}
}
