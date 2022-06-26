package algorithms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int nums[] = {-12,33,44,5,4,0,-22};
        //bubble(nums);
        //Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        List<Integer> ans = targetIndices(nums,33);
        System.out.println(ans);
    }
    public static List<Integer> targetIndices(int[] nums, int target) {
        bubble(nums);
      //  int[] index;
        Arrays.sort(nums);
        List<Integer> list = new ArrayList();
        for(int k=0;k<nums.length;k++){
            if(target==nums[k]){
               list.add(k);
            }
        }
       // List<Integer> list = new List();
        //list.addALL(index);
        return list;
    }
    public static void bubble(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length-i;j++){
                swap(nums,j-1,j);
            }
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}