package algorithms;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] nums ={-12,4,0,53,12,1,3,5};
        System.out.println("before sorting");
        System.out.println(Arrays.toString(nums));
        bubble(nums);
        System.out.println("after sorting");
        System.out.println(Arrays.toString(nums));

    }
    static void bubble(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped=false;
            for (int j = 1; j <= arr.length-i-1; j++) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}

