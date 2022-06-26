package algorithms;

public class linearsearch{
    public static int linearsearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length ; index++) {
            int element=arr[index];
            if(element==target){
                return index;
            }
        }return -1;
    }
    public static void main(String[] args) {
        int[] nums={10,20,30,40,50,60};
        int ans=linearsearch(nums,530);
        System.out.println(ans);
    }
}




