package practise;

public class Prime {
	public static void main(String[] args) {
		
		int num = 20;
		boolean isPrime = true;
		
		
		if(num<0) {
			System.out.println("number should be positive");
			isPrime = false;
		}else if(num < 2) {
			isPrime = false;
			
		}else {
		for(int i=2;i<Math.sqrt(num);i++){
			if(num %i == 0) {
				isPrime = false;
				break;
				}
		}
	}
		if(isPrime == true)
		{
			System.out.println("prime number");
		}else {
			System.out.println("not prime");
		}
		
		boolean isEven= true;
		
		if(num%2 == 0) {
			isEven = true;
		}else {
			isEven = false;
		}
		
		if(isEven == true)
		{
			System.out.println("even number");
		}else {
			System.out.println("odd number");
		}
		

}
}
