
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
            int index  = quick(arr, l, r);
            QuickSort(arr,l,index-1);
            QuickSort(arr,index+1,r);
        }
    }
    private static int quick(int[] arr, int l, int r){
        int pivot = arr[r];
        int i = l-1;
        for(int j=l ; j < r; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[r];
        arr[r] = arr[i+1];
        arr[i+1] = temp;
        return i+1;
    }
}
