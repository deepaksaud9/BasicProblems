package coreJavaBasicProblem;

import java.util.Scanner;

public class ReverseInput {

	
	public static void main(String[] args) {
		
		System.out.println("enter your String");
		Scanner scn = new Scanner(System.in);
		String	rev = scn.next();
	
		String r = reverse(rev);		
		System.out.println(r);
	}
	//method defined
	public static String reverse(String s)
	{
		char [] letters  = new char[s.length()];	
		int lettersIndex = 0;
		
		for(int i=s.length()-1;i>=0;i--)
		{
			letters[lettersIndex] = s.charAt(i);
			lettersIndex++;
		}
		String reverse = " ";
		
		for(int i=0; i<s.length();i++)
		{
			reverse = reverse+letters[i];	
			}
		
		return reverse;
	}
}
