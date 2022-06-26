//question search for 3 in the range of index[1,4]
//arr=[19,12,-3,3,14,28];
package algorithms;

public class searchinrange {
    static int searchinrange(int arr[],int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for (int i = start; i <=end; i++) {
            int element=arr[i];
            if(element==target){
                return i;
            }

        }return -1;

    }
    public static void main(String[] args) {
        int[] nums={10,20,30,40,50,60};
        int target=50;
        int ans=searchinrange(nums,target,0,2);
        System.out.println(ans);
    }
}
