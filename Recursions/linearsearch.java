package recursion;

import java.util.ArrayList;

public class linearsearch {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,4,4,5,};
        int target = 4;
//        boolean ans= linear(nums,target,0);
//        System.out.println(ans);
    //        ArrayList<Integer> ans =findallindex(nums,target,0,new ArrayList<>());
    //        System.out.println(ans);
            System.out.println(findallindex2(nums,target,0));
    }
    static boolean linear(int[] arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        if(arr[index]==target){
            return true;
        }
        else{
            return linear(arr,target,index+1) ;
        }
    }
    static int linearfind(int[] arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
        return linearfind(arr,target,index+1);
        }
    }
    static ArrayList<Integer> findallindex(int[] arr , int target,int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(target==arr[index]){
            list.add(index);
        }
        return findallindex(arr,target,index+1,list);
    }
    static ArrayList<Integer> findallindex2(int[] arr , int target,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        //this will contain answer for that func only
        if(target==arr[index]){
            list.add(index);
        }
      ArrayList<Integer> ansfrmbelowcalls = findallindex2(arr,target,index+1);
        list.addAll(ansfrmbelowcalls);
        return list;
    }
}
