package algorithms;
//find the min element in the array
public class minnumber {
    public static void main(String[] args) {
        int nums[]={10,20,30,40,50,60,-1,-4};
        System.out.println(min(nums));
    }
    //return thr min value int the array
    static int min(int[] arr){
        int ans=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;


    }
}
