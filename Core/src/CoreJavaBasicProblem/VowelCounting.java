package coreJavaBasicProblem;

import java.util.Scanner;

public class VowelCounting {
	public static void main(String[] args) {
		
	
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter a list of strings: ");
     String[] input = sc.nextLine().split("\\s+");

     for (String str : input) {
         int vowelNumCount = 0;
         for (int i = 0; i < str.length(); i++) {
             char ch = Character.toLowerCase(str.charAt(i));
             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                 vowelNumCount++;
             }
         }
         if (vowelNumCount == 0) {
             System.out.println("No Vowels");
         } else if (vowelNumCount > 10) {
             System.out.println("Too many Vowels");
         } else {
             System.out.println(vowelNumCount);
         }
     }
     }
 }




