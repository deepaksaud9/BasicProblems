package practise;

public class Reverse {
	public static void main(String[] args) {
		String str = "Deepak";
		char[] str1 = str.toCharArray();
		int start = 0;
		int end = str1.length-1;
		
		while(start<end) {
			
			char temp = str1[start];
			str1[start]=str1[end];
			str1[end]=temp;
			
			start++;
			end--;
		}
		for (char c : str1) {
			System.out.print(c);
		}
		
		
	}

}
