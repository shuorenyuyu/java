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
    private static void QuickSort(int[] arr, int l, int r){
        if(l < r){
            int index = quick(arr,l,r);
            QuickSort(arr,index+1,r);
            QuickSort(arr,l,index-1);
        }
    }
    private static int quick(int[] arr, int l, int r){
        int i = l-1;
        int pivot = arr[r];
        for(int j = l; j < r; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[r];
        arr[r] = arr[i+1];
        arr[i+1] = temp;
        return i+1;
    }
}
