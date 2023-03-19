package practise;

/*-- find pairs with given sum is sorted in a sorted array
 *-- given an array of size N
 *-- we need to find all pairs in the array that sum to a number equal to k
 *-- If no such pairs exists then output will be -1 
 * */
public class PairSum {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,5,6,7};
		int sum = 9;
		int high = arr.length-1;
		int low = 0;
		
		
		while(low < high) {
			if(arr[low]+arr[high]>sum) {
				high--;
			}else if(arr[low]+arr[high]<sum) {
				low++;
		}else if(arr[low]+arr[high]==sum) {
			System.out.println("pair("+arr[low]+" "+arr[high]+")");
		high--;
		low++;
		}
			
		}
		
	}
}
