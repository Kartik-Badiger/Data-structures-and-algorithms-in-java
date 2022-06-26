package recursion;

public class binarysearch {
    public static void main(String[] args) {
        int[] nums = {-12,0,10,42,55,211};
        int target = 0;
        int ans = search(nums,target,0,nums.length-1);
        System.out.println(ans);
    }
    static int search(int[] arr,int target,int s,int e){
        int mid= s + (e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return search(arr,target,s,mid-1);

        }else{
            return search(arr,target,mid+1,e);
        }
    }
}
