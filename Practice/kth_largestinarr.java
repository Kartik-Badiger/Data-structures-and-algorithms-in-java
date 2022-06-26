package practice;

import java.util.Arrays;

public class kth_largestinarr {
    public static void main(String[] args) {
        int [] nums={34,21,21,54,63};
        int a=findKthLargest(nums,1);
        System.out.println(a);
    }
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        if(k==0){
            return -1;
        }
        int j=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[j++]=nums[i];
            }
        }
        nums[j++]=nums[nums.length-1];
        int large=nums[nums.length-k];
        return large;
    }
}
