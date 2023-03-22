package src;
public class PrintNumberOneToHundredWithoutLoop {

	public static void main(String[] args) {
		
		int input = 1;
	
		printNum(input);
	}
	public static String printNum(int number)
	{
		
		if(number<=100)
		{
			System.out.println(number);
			number++;
			printNum(number);
		}
			
		return "";
	}
}
