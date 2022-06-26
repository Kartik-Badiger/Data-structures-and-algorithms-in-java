package practice;

import java.util.Arrays;

public class productofarrayexceptitself {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int [] ans=productExceptSelf(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] productExceptSelf(int[] nums) {
        int product=1;
        for(int i=0;i<nums.length;i++){

            for(int j=0;j<nums.length;j++){

                product=product*nums[j+1];
            }
            nums[i]=product;
            product=1;
        }
        return nums;
    }
}
