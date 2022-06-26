package algorithms;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
     int[] nums={-123,22,44,57,0,1};
        System.out.println("before sorting "+Arrays.toString(nums));
     selectionsort(nums);
        System.out.print("after sorting ");
     System.out.println(Arrays.toString(nums));

    }
    static void selectionsort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
           int last=arr.length-i-1;
           int maxindex = getmaxindex(arr,0,last);
            swap(arr,maxindex,last);
        }
    }
    static int getmaxindex(int[] arr,int start,int last){
        int max=0;
        for (int i = start; i <=last ; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }

        }
        return max;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}