import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * input: 5
 *        5
 *        +...+
 *        .+.+.
 *        ..+..
 *        .+.+.
 *        +...+
 */
public class SAP {
    public static void main(String args[]){
       int r = 5, c= 5;
       String[][] arr = {
               {"+",".",".",".","+"},
               {".","+",".","+","."},
               {".",".","+",".","."},
               {".","+",".","+","."},
               {"+",".",".",".","+"}
       };
       System.out.println(sap(5,5,arr));
    }
    private static int sap(int r, int c, String[][] arr){
       
        int res = 0;
        for(int i=0; i < c; i+= 2){
            for(int j=0; j < r; j++){
                if(check(arr,i,j)  && arr[i][j] == "."){
                    arr[i][j] = "+";
                }
            }
        }
        for(int i=1; i < c; i+= 2){
            for(int j=0; j < r; j++){
                if(check(arr,i,j) && arr[i][j] == "."){
                    arr[i][j] = "+";
                }
            }
        }
        for(int i=0; i < c; i++){
            for(int j=0 ; j < r; j++){
                if(arr[i][j] == ".") res++;
            }
        }
        return res;
    }
    private static boolean check(String[][] arr,int i, int j){
        if(i > 0 && j>0 && arr[i-1][j-1] == "."){
            return true;
        }
        if(i > 0 && j < arr[0].length-1 && arr[i-1][j+1] == "."){
            return true;
        }
        if(i < arr.length-1 && j>0 && arr[i+1][j-1] == "."){
            return true;
        }
        if(i < arr.length-1 && j < arr[0].length-1 && arr[i+1][j+1] == "."){
            return true;
        }
        if(j > 0 && arr[i][j-1] == "."){
            return true;
        }
        if(j < arr[0].length-1 && arr[i][j+1] == "."){
            return true;
        }
        return false;
    }
}
