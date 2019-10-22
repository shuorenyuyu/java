public class MergeSort {
    static int[] arr;
    public static void main(String args[]){
        arr = new int[]{1,11,3,4,43,6,7,8};
        mergeSort(arr,0,arr.length-1);
        for(int i: arr){
            System.out.println(i);
        }
    }
    static void mergeSort(int[] array, int l, int r) {

        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(array, l, m);
            mergeSort(array, m + 1, r);
            merge(array, l, m, r);
        }
    }
     public static void merge(int[] array, int l, int m, int r) {
        int[] temp = array.clone();
        int left = l;
        int right = m + 1;
        int pos = left;

        while (left <= m || right <= r) {
            if (left <= m && right <= r) {
                if (temp[ left ] <= temp[ right ]) {
                    array[ pos ] = temp[ left ];
                    left++;
                } else {
                    array[ pos ] = temp[ right ];
                    right++;
                }
            } else if (left <= m) {
                array[ pos ] = temp[ left ];
                left++;
            } else if (right <= r) {
                array[ pos ] = temp[ right ];
                right++;
            }
            pos++;
        }
    }
}

