import java.io.*;
import java.util.HashSet;
import java.util.Stack;
import java.util.HashMap;
import java.util.Collections;
public class TwoDArray {
    public static void main(String args[]) {
        int[][] arr = new int[10][10];
        int temp = 10;
        for(int i=0;i<10;i++){
            arr[0][i] = i;
            arr[1][i] = temp;
            temp++;
        }
        System.out.println(Find(110,arr));
    }
    private static boolean Find(int target, int [][] array) {
        int l = 0;
        for(int i=0; i < array.length;i++){
            if(target == array[i][0]){
                return true;
            }
            if(target > array[i][0]){
                l = i; continue;
            }
        }
        for(int i=0;i < array[0].length;i++){
            if(array[l][i] == target){
                return true;
            }
        }
        return false;
    }
}
