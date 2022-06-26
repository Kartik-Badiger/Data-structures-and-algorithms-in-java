package practice;

import java.util.Arrays;

public class rotatearray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        int nums[]=rotate(arr,3);
        System.out.println(Arrays.toString(nums));
    }
    public static int[] rotate(int[] nums, int k) {
        int[] ans =new int[nums.length];
        int count=0;
        for(int i=k;i<nums.length;i++){
            ans[count]=nums[i];
            count++;
        }
        for(int i=0;i<k;i++){
            ans[count+i]=nums[i];
        }
        for (int i = 0; i < ans.length ; i++) {
            nums[i]=ans[i];
        }
        return nums ;
    }
}
