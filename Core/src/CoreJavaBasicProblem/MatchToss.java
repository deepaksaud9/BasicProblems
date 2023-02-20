package coreJavaBasicProblem;

import java.util.Random;
import java.util.Scanner;

public class MatchToss {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter 1 for choose head and 2 for tail");
	int input = sc.nextInt();
			
	
	Random toss = new Random();
	
	int tossResult = toss.nextInt(2) + 1;
	
	if(tossResult==1)
	{
		System.out.println("Toss result = Head");	
		
	}else
	{
		System.out.println("toss result = tail");
	}
	
	if (tossResult == input)
	{
		System.out.println("congrulation you won the toss");
	}else
	{
		System.out.println("sorry you loose the toss");
	}
	

}
}
