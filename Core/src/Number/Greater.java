package Number;

public class Greater {
	
	public static void main(String[] args) {
		int[] arr = new int[] {4,9,12,10,56,62,00,76,99,9,10,7};
		int max=0;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]>max) {
			max=arr[i];
			}
		}
		System.out.println(max);
		
	}

}
