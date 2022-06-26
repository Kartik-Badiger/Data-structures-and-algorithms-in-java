package algorithms;

import java.util.Arrays;

public class mergeprac {
    public static void main(String[] args) {
        int[] nums={-2,2,-33,22,11,53,52};
        int[] ans = mergesort(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int [] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int [] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] merged = new int[first.length+second.length];
        int i =0;
        int j =0;
        int k =0;
        while (i<first.length && j<second.length){
            if(first[i]<second[j]){
                merged[k]=first[i];
                i++;
            }
            else{
                merged[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            merged[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            merged[k]=second[j];
            j++;
            k++;
        }
        return merged;
    }
}