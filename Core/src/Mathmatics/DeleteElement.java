package Mathmatics;

import java.util.Arrays;

public class DeleteElement {
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6,7,8};
		int[] newArr = new int[arr.length-1];
		int deleteElement = 2;
		for(int i=0 ,j=0;i<arr.length;i++) {
			if(i != deleteElement)
			{
				newArr[j++]=arr[i];
			}
		}
		arr=newArr;
		System.out.println(Arrays.toString(arr));
	}
	
	
	
}
