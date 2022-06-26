package algorithms;
import java.util.Arrays;
public class insertionsort {
    public static void main(String[] args)  {
        int[] nums ={40,30,20,10,0};
        insertionsort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void insertionsort(int[] arr){
        for (int i = 0; i <=arr.length-2; i++) {
            for (int j = i+1; j>0 ; j--) {
                if(arr[j-1]>arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                else{
                    break;
                }
            }
        }

    }
}
