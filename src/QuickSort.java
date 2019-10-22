public class QuickSort {
    static int[] arr;
    public static void main(String args[]){
        arr = new int[]{1,11,3,4,43,6,7,8};
        quick(arr, 0, arr.length-1);
        for(int i: arr){
            System.out.println(i);
        }
    }
    private static void quick(int[] arr, int l, int r){
        while(l < r){
            int index = sort(arr,l,r);
            quick(arr,l,index-1);
            quick(arr,index+1, r);
        }
    }
    private static int sort(int[] arr, int l, int r){
        int pivot = arr[r];
        int i = l-1;
        for(int j = l; j < r; j ++){
            if(arr[j] < pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap pivot
        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;
        return i;
    }
}
