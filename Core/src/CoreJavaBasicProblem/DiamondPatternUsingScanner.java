package coreJavaBasicProblem;

import java.util.Scanner;

public class DiamondPatternUsingScanner {

	public static void main(String[] args) {
		System.out.println("Enter, How many star do you want?");
		
		Scanner input = new Scanner(System.in);
		int noOfStar = input.nextInt();
		
		for(int i=1;i<=noOfStar;i++)  //i iterates rows
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=noOfStar-1; i>0;i--)  //j iterates column
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
