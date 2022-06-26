package practice;

public class sortcolorsusingmergesort {
    public static void main(String[] args) {

    }
    public void sortcolors(int[] nums){
        int mid=nums.length/2;
        int[] left = new int[mid];
        int[] right = new int[nums.length-mid];
        for (int i = 0; i < mid; i++) {
            left[i]=nums[i];
        }
        for (int i = mid; i < nums.length ; i++) {
            right[mid-i]=nums[i];
        }
        sortcolors(left);
        sortcolors(right);
        merge(left,right);

    }

    private void merge(int[] left, int[] right) {
        int merged[] = new int[left.length+ right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i< left.length && j< right.length){
            if(left[i]<right[i]){
                merged[k]=left[i];
                i++;

            }else{
                merged[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            merged[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            merged[k]=right[j];
            j++;
            k++;
        }

    }
}

