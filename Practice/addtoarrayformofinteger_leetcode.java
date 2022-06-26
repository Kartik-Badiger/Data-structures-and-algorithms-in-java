package practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.pow;

public class addtoarrayformofinteger_leetcode {
    public static void main(String[] args) {
            int num[] ={2,7,4};
//        System.out.println(Arrays.toString(addToarrayForm(num,181)));
        List<Integer> list = new ArrayList<>();
        list =addToarrayForm(num,1) ;
//        System.out.println(list);
    }

    public static List<Integer> addToarrayForm(int [] num , int k){
        int p=0;
        for(int i=0;i<num.length;i++){
            p= (int) (p+num[i]*pow(10,num.length-i-1));
        }
        int n=p+k;
        int l=n;
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }
        List<Integer> ans=new ArrayList<Integer>(count);
        //int[] ans = new int[count];
        for(int i=0;i<count;i++){
           ans.set(i, (int) (l / (pow(10, count - i - 1))));
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