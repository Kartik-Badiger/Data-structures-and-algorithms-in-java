package practice;

import java.util.Arrays;

public class algo {
    public static void main(String[] args) {
        int [] nums ={5,4,3,2,1};
        selectionsort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void selectionsort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxindex = getmaxindex(arr,0,last);
            swap(arr,maxindex,last);
        }
    }

    private static int getmaxindex(int[] arr, int start, int last) {
        int max= 0;
        for (int i = start; i <=last ; i++) {
            if(arr[max]<arr[i]){

            max=i;
            }
        }
        return max;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j]= temp;
    }
}