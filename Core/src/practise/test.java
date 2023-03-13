package practise;

public class test {
	public static void main(String[] args) {
	    int[] arr = {1,3,4,6,7,8,9,3,5,7,2,9};
	    boolean isDuplicate = false;
	    int[] uniqueArr = new int[arr.length];
	    int[] duplicateNum = new int[arr.length];
	    int index = 0;
	    
	    for (int i = 0; i < arr.length; i++) {
	        boolean foundDuplicate = false;
	        for (int j = 0; j <=index+1; j++) {
	            if (arr[i] == uniqueArr[j]) {
	                foundDuplicate = true;
	                break;
	            }
	        }
	        if (foundDuplicate) {
	            isDuplicate = true;
	            duplicateNum[index] = arr[i];
	            index++;
	        } else {
	            uniqueArr[index] = arr[i];
	            index++;
	        }
	    }
	    
	    if (isDuplicate) {
	        System.out.println("duplicate numbers are:");
	        for (int i = 0; i < index; i++) {
	            System.out.println(duplicateNum[i]);
	        }
	    } else {
	        System.out.println("no duplicates found");
	    }
	}

}
