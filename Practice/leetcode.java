package practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcode {
    public static void main(String[] args) {
        int[] nums ={1,1,2};
        int []ans = removeDuplicates(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] removeDuplicates(int[] nums) {
//        int i = 0;
//        int j = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j=1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    nums[j] = nums[j + 1];
                }
            }
        }
        return nums;
    }
}
