package practise;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
	
	public static void main(String[] args) {
		
		int[] arr = {1,3,4,6,7,8,9,3,5,7,2,9};
		Set<Integer> uniqueArray = new HashSet<>();
		boolean isDuplicate=false;
		int[] duplicateNum = new int[arr.length];
		int index=0;
		
		for(int i=0;i<arr.length;i++) {
			if(uniqueArray.contains(arr[i])) {
				isDuplicate = true;
//				System.out.println("duplicate"+arr[i]);
				duplicateNum[index]= arr[i];
				index++;
				
			}else {
				uniqueArray.add(arr[i]);
			}
		}
		
		
		
		if(isDuplicate)
		{
			System.out.println("duplicate number are ");
			for(int i=0;i<index;i++) {
				System.out.println(duplicateNum[i]);
			}
		
		}else {
			System.out.println("no duplicate found");
		}
			
	}
}
