package algorithms;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int ans =binarysearch(arr,5);
        System.out.println(ans);
    }
    public static int binarysearch(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        int mid = 0;
        while(s<=e){
            mid=s+(e-s)/2;
            if(target<arr[mid]){
                e=mid-1;
            }
            if(target>arr[mid]){
                s=mid+1;
            }
            if(target==arr[mid]){
                return mid;
            }
        }
        return mid;
    }
}

