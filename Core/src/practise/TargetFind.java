package practise;

class TargetFind {

    public static void main(String[] args){

        int[] arr = new int[] {2,7,11,15};
        int target = 9;

        twoSum(arr, target);
    }   

    public static void twoSum(int[] nums, int target) {
        
        int start = 0;
        int end = nums.length-1;

        while(start<end){
            if(nums[start] + nums[end] > target){
               end--;
            }else if(nums[start] + nums[end] < target){
                start++;
            }else if(nums[start] + nums[end] == target){
                System.out.println(nums[start] + " + " + nums[end]);
                start++;
                end--;
            }
        }

        }
}
