
package algorithms;

//
//import java.util.Arrays;
//
//public class pracalgo {
//    public static void main(String[] args) {
//        int[] arr={5,4,3,2,1};
//        selection(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void selection(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            int last= arr.length-i-1;
//            int maxindex=getmaxindex(arr,0,last);
//            swap(arr,maxindex,last);
//        }
//    }
//    public static int getmaxindex(int[] arr,int start,int last){
//        int max=0;
//        for (int i = 0; i <=last; i++) {
//            if(arr[max]<arr[i]){
//                max=i;
//            }
//        }
//        return max;
//    }
//    public static void swap(int[] arr,int first,int second){
//        int temp =arr[first];
//        arr [first]=arr [second];
//        arr [second]=temp;
//    }
//}


import java.util.Arrays;

public class pracalgo {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertion(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j-1,j);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}