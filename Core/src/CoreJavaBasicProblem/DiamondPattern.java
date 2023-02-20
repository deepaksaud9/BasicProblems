package coreJavaBasicProblem;

public class DiamondPattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)  //i iterates rows
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=4; i>0;i--)  //j iterates column
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
