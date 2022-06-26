package algorithms;

import java.util.Arrays;

public class quicksortprac {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        quicksort(nums,0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    static void quicksort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int s = low;
        int e = high;
        int mid = s +(e-s)/2;
        int p = arr[mid];
        while(s<=e){
            while (arr[s]<p){
                s++;
            }
            while(arr[e]>p){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
             }
            quicksort(arr,low,e);
            quicksort(arr,s,high);
        }
    }
}