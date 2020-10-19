import com.sun.xml.internal.bind.v2.model.annotation.Quick;

/*
QuickSort
 */
public class QuickSort {
    static int[] arr;
    public static void main(String args[]){
        arr = new int[]{1,11,3,4,43,6,7,8};
        QuickSort(arr,0,arr.length-1);
        for(int i=0 ; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    static void QuickSort(int[] nums, int l, int r){
        if(l < r){
            int index = quick(nums,l,r);
            QuickSort(nums,index+1,r);
            QuickSort(nums,l,index-1);
        }
    }
    static int quick(int[] nums,int l, int r){
        int i = l-1;
        int pivot = nums[r];
        for(int j=l; j < r; j++){
            if(nums[j] < pivot){
                i++;
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
        int temp = nums[r];
        nums[r] = nums[i+1];
        nums[i+1] = temp;
        return i+1;
    }
}
