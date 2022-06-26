package algorithms;

import java.util.Arrays;

public class mergesortinplaceprac {
    public static void main(String[] args) {
        int arr[] = {-2,0,34,2,-33};
        merges(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void merges(int[] arr,int s ,int e){
        if((e-s)==1){
            return;
        }
        int mid = s + (e-s)/2;
        merges(arr,s,mid);
        merges(arr,mid,e);
        merge(arr,s,mid,e);
    }

    private static void merge(int[] arr, int s, int mid, int e) {
        int i =s;
        int j = mid;
        int k =0;
        int [] merge = new int[e-s];
        while(i<mid && j<e){
            if(arr[i]<arr[j]){
                merge[k] = arr[i];
                i++;
            }else{
                merge[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<mid){
            merge[k] = arr[i];
            i++;
            k++;
        }
        while (j<e){
            merge[k]= arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < merge.length; l++) {
            arr[s+l] = merge[l];
        }
    }
}