package practice;


import java.util.Arrays;

import static java.lang.Math.pow;

public class oneplus {
    public static void main(String[] args) {
        long num[] ={9,8,7,6,5,4,3,2,1};
//        System.out.println(Arrays.toString(plusOne(num)));
    }

    public static int[] plusOne(int [] digits ){
        int p=0;
        for(int i=0;i<digits.length;i++){
            p= (int) (p+digits[i]*pow(10,digits.length-i-1));
        }
        long n=p+1;
        long l= n;
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }
        int[] ans = new int[count];
        for(int i=0;i<count;i++){
            ans[i] = (int) (l/(pow(10,count-i-1)));
            l= (int) (l%pow(10,count-i-1));
        }
        return ans;
    }
}
//public int findNumbers(int[] nums) {
//        int counter=0;
//        for(int i=0;i<nums.length;i++){
//        if(finddigits(nums[i])%2==0){
//        counter++;
//        return counter;
//        }
//        }
//        return counter;
//        }
//public int finddigits(int n){
//        int count=0;
//        while(n!=0){
//        count++;
//        n/=10;
//        }
//        return count;